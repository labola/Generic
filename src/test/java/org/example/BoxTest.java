package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class BoxTest {

    @Test
    public void testBox() {
        Box<String, Integer, Float> box1 = new Box<>("String", 2, 3.5f);
        Box<String, Integer, Float> box2 = new Box<>("String", 5, 6.5f);

        assertEquals(17, box1.getNumberInt() + box1.getNumberFloat() + box2.getNumberInt() + box2.getNumberFloat(), 0.001);
    }
}