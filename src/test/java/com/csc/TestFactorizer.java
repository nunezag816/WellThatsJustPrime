package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFactorizer {

  Factorizer factorizer;

  @BeforeEach
  void setUp() {
    factorizer = new Factorizer();
  }

  // Replace the following example tests with your own tests
  // of the prime factorization function.
  @Test
  public void testZero() {
    assertEquals(2, factorizer.exampleMethod(0));
  }

  @Test
  public void testOne() {
    assertEquals(2, factorizer.exampleMethod(1));
  }

  @Test
  public void testTen() {
    assertEquals(1, factorizer.exampleMethod(10));
  }
}
