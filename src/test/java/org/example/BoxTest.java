package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.*;
import java.util.List;

import static org.junit.Assert.*;


public class BoxTest {

    @Test
    public void testBox() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        List<Integer> numbers2 = new ArrayList<>();
        Box.transfer(numbers, numbers2);
        assertEquals(0,numbers.size());
        assertEquals(10,numbers2.size());

    }

  
}
