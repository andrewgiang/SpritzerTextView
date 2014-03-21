package com.andrewgiang.textspritzer.lib;

/**
 * Created by andrewgiang on 3/19/14.
 */
public class DefaultDelayStrategy implements DelayStrategy {
    @Override
    public int delayMultiplier(String word) {
        if (word.length() >= 6 || word.contains(",") || word.contains(":") || word.contains(";") || word.contains(".") || word.contains("?") || word.contains("!") || word.contains("\"")) {
            return 3;
        }
        return 1;
    }
}
