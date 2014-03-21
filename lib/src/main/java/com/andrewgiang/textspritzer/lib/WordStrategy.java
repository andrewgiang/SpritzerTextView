package com.andrewgiang.textspritzer.lib;

/**
 * Created by carmstrong on 3/20/14.
 */
public interface WordStrategy {
    public wordObj parseWord(String word, int millisecondsPerWord);
}
