package com.game.utils;

import com.game.business.impl.NumberGameImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Utility class to run the program.
 *
 * Created by ravender on 2/21/2016.
 */
public final class Utils {

    private Utils() { }

    public static void main(String... args) {
        System.out.println("Choose a number range between 1-100 and type \"ready\": ");

        Scanner keyboard = new Scanner(System.in, "UTF-8");
        String str = keyboard.nextLine();

        if (!"ready".equalsIgnoreCase(str)) {
            System.out.println("Wrong input, exiting!!");
            System.exit(1);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        new NumberGameImpl().guessTheNumber(list, false);
    }

}
