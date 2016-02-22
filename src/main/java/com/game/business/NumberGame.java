package com.game.business;

import java.util.List;

/**
 * Determines the number guessed by user.
 * Created by ravender on 2/21/2016.
 */
public interface NumberGame {

     /**
     * Determines the guessed number.
     *
     * @param listOfNumbers the list from which number to be guessed.
     * @param isRecursive to be used to identify
     */
    void guessTheNumber(List<Integer> listOfNumbers, boolean isRecursive);
}
