package com.andrewgiang.textspritzer.lib;

import android.test.AndroidTestCase;
import android.widget.TextView;

/**
 * Created by andrewgiang on 3/11/14.
 */
public class SpritzerTest extends AndroidTestCase {

    /**
     * Test cases are in this format:
     * LongWordToTest:ExpectedSplit:WordAddedToQueue
     */
    public static String[] splitWordTests = {
            "abcdefghijklmnopqrstuv:abcdefghijk-:lmnopqrstuv", //Long word test 22 characters
            "hyperactive-monkey:hyperactive-:monkey", //Hyphen long word test
            "abcdefghijk.lmnopqrstuv:abcdefghijk.:lmnopqrstuv", //Period long word test
            "abcdefghijklmnopqrstuvwxyz0:abcdefghijklm-:nopqrstuvwxyz0" //27 characters should use 13 use MAX_CHARS as split index
    };
    protected Spritzer spritzer;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        spritzer = new Spritzer(new TextView(getContext()));
    }


    public void testSplitWordList() {
        for (String tests : splitWordTests) {
            final String[] split = tests.split(":");
            assertEquals(3, split.length);
        }
    }

    public void testSplitWords() {
        for (String tests : splitWordTests) {
            final String[] arry = tests.split(":");
            String longword = arry[0];
            String expectedSplit = arry[1];
            String expectedAddedToQueue = arry[2];
            assertEquals(expectedSplit, spritzer.splitLongWord(longword));
            assertEquals(expectedAddedToQueue, spritzer.mWordQueue.peek());
            spritzer.mWordQueue.clear();
        }

    }
}
