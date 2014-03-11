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
    public static String[] longWordTests = {
            "abcdefghijklmnopqrstuv:abcdefghijklm-:nopqrstuv",
            "hyperactive-monkey:hyperactive-:monkey",
            "abcdefghijk.lmnopqrstuv:abcdefghijk.:lmnopqrstuv"
    };
    protected Spritzer spritzer;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        spritzer = new Spritzer(new TextView(getContext()));
    }


    public void testSplitLongWords(){


        for(String tests: longWordTests){
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
