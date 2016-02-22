package com.game.business.impl;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by ravender on 2/21/2016.
 */
public class NumberGameImplTest {

    private NumberGameImpl numberGameImpl;

    @Before
    public void setUp() {
        numberGameImpl = new NumberGameImpl();
    }

    @Test
    public void testGetNextNumber() throws IOException {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }
        assertEquals(50, numberGameImpl.getNextNumber(list, list.size()));
    }

    @Test
    public void testGetNextNumber1() throws IOException {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 75; i++) {
            list.add(i);
        }
        assertEquals(37, numberGameImpl.getNextNumber(list, list.size()));
    }

    @Test
    public void testGetNextNumberWithSizeOne() throws IOException {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 1; i++) {
            list.add(i);
        }
        assertEquals(1, numberGameImpl.getNextNumber(list, list.size()));
    }

}
