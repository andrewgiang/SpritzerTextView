package com.andrewgiang.textspritzer.lib;

/**
 * Created by carmstrong on 3/20/14.
 */
public class DefaultWordStrategy implements WordStrategy{

    @Override
    public WordObj parseWord(String word, int millisecondsPerWord){
        WordObj retWordObj = new WordObj();

        // Set Delay for punctuation and length
        if (word.length() >= 6 || word.contains(",") || word.contains(":") || word.contains(";") || word.contains(".") || word.contains("?") || word.contains("!") || word.contains("\"")) {
            retWordObj.setDelay(3 * millisecondsPerWord);
        } else {
            retWordObj.setDelay(1 * millisecondsPerWord);
        }

        retWordObj.setParsedWord(word);

        return retWordObj;
    }
}
