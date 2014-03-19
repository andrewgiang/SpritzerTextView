package com.andrewgiang.textspritzer.lib;

/**
 * Created by andrewgiang on 3/19/14.
 */
public interface DelayStrategy {

    /**
     * A delay strategy for @see{@link Spritzer#processNextWord()} that
     * will determine how long the Thread
     * sleeps after a word is being processed. This delay time
     * is calculated by multiplying the @see{@link Spritzer#getInterWordDelay()}
     * with the return value from this method.
     * <p/>
     * The default strategy can be found @
     *
     * @param word the word to be checked for a possible delay multiplier
     * @return int multiplier
     * @see {@link com.andrewgiang.textspritzer.lib.DefaultDelayStrategy}
     */
    public int delayMultiplier(String word);

}
