package com.andrewgiang.textspritzer.lib;

import android.test.AndroidTestCase;
import android.widget.TextView;

/**
 * Created by andrewgiang on 3/11/14.
 */
public class SpritzerTest extends AndroidTestCase {


    public static final String SEPARATOR = ":";

    /**
     * Test cases are in this format:
     *    "WordToTest"+ SEPARATOR +
     *     "FirstHalfWord"+ SEPARATOR +
     *     "SecondHalfWord",
     */
    public static String[] splitWordTests = {
            "abcdefghijklmnopqrstuv" + SEPARATOR +
                    "abcdefghijk-" + SEPARATOR +
                    "lmnopqrstuv", //Long word test 22 characters

            "hyperactive-monkey" + SEPARATOR +
                    "hyperactive-" + SEPARATOR +
                    "monkey", //Hyphen long word test

            "abcdefghijk.lmnopqrstuv" + SEPARATOR +
                    "abcdefghijk." + SEPARATOR +
                    "lmnopqrstuv", //Period long word test

            "abcdefghijklmnopqrstuvwxyz0" + SEPARATOR +
                    "abcdefghijklm-" + SEPARATOR +
                    "nopqrstuvwxyz0" //27 characters should use MAX_CHARS(13) as split index
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
