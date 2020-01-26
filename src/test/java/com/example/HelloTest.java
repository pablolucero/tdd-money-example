package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    void greet() {
        assertEquals("Hello Pablo", Hello.greet("Pablo"));
    }
}