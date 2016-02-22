package com.game.business.impl;

import com.game.business.NumberGame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * This class implements NumberGame.
 * Determines the number guessed by user.
 * Created by ravender on 2/21/2016.
 */
public class NumberGameImpl implements NumberGame {

    private static final Logger LOGGER = LoggerFactory.getLogger(NumberGameImpl.class);

    /**
     * Determines the number guessed by user.
     *
     * @param listOfNumbers the list from which number to be guessed.
     * @param isRecursive to be used to identify.
     */
    public void guessTheNumber(List<Integer> listOfNumbers, boolean isRecursive) {

        if (!isRecursive) {
            Collections.sort(listOfNumbers);
        }

        int right = listOfNumbers.size();

        getNextNumber(listOfNumbers, right);

        String input = new Scanner(System.in, "UTF-8").nextLine();

        if ("yes".equalsIgnoreCase(input)) {
            System.out.println("There you go!!"); // console output can be removed
            LOGGER.info("There you go!!");
        } else if ("higher".equalsIgnoreCase(input)) {
            guessTheNumber(listOfNumbers.subList(right / 2, right), true);
        } else if ("lower".equalsIgnoreCase(input)) {
            guessTheNumber(listOfNumbers.subList(0, right / 2 - 1), true);
        } else {
            System.out.println("Wrong choice!!");  // console output can be removed
            LOGGER.info("Wrong choice!!");
            throw new IllegalArgumentException("Wrong choice!!");
        }
    }

    /**
     * Generates the next number from provided listOfNumbers.
     *
     * @param listOfNumbers listOfNumbers the list from which number to be generated.
     * @param size size of the list
     * @return generated number
     */
    protected int getNextNumber(List<Integer> listOfNumbers, int size) {
        String tobeReplaced = "{number}";
        String prompt = "Is your number {number} ? ";
        if (1 == size) {
            System.out.println(prompt.replace(tobeReplaced,
                    String.valueOf(listOfNumbers.get((size - 1))))); // console output can be removed
            LOGGER.info(prompt.replace(tobeReplaced, String.valueOf(listOfNumbers.get((size - 1)))));
            return listOfNumbers.get((size - 1));
        } else {
            System.out.println(prompt.replace(tobeReplaced,
                    String.valueOf(listOfNumbers.get(size / 2 - 1) + "? "))); // console output can be removed
            LOGGER.info(prompt.replace(tobeReplaced, String.valueOf(listOfNumbers.get(size / 2 - 1) + "? ")));
            return listOfNumbers.get(size / 2 - 1);
        }
    }
}
