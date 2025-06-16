package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    ArrayList<Integer> factors = new ArrayList<>();
    if (n == null || n <= 1) return factors;

    int number = n;
    for (int i = 2; i * i <= number; i++) {
      while (n % i == 0) {
        factors.add(i);
        n /= i;
      }
    }

    if (n > 1) {
      factors.add(n);
    }

    return factors;
  }

  public boolean isPrime(Integer n) {
    return primeFactors(n).size() == 1;
  }

  public boolean isComposite(Integer n) {
    return n != null && n > 1 && !isPrime(n);
  }

  public String reduce(Integer numerator, Integer denominator) {
    if (denominator == null || denominator == 0) {
      throw new IllegalArgumentException("Denominator cannot be zero.");
    }

    if (numerator == null) {
      throw new IllegalArgumentException("Numerator cannot be null.");
    }

    ArrayList<Integer> numFactors = primeFactors(Math.abs(numerator));
    ArrayList<Integer> denFactors = primeFactors(Math.abs(denominator));

    for (int i = 0; i < numFactors.size(); i++) {
      int factor = numFactors.get(i);
      if (denFactors.contains(factor)) {
        denFactors.remove((Integer) factor);
        numFactors.remove(i);
        i--;
      }
    }

    int reducedNum = product(numFactors);
    int reducedDen = product(denFactors);

    if ((numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0)) {
      reducedNum = -reducedNum;
    }

    if (reducedDen == 1) return Integer.toString(reducedNum);
    if (reducedNum == 0) return "0";
    return reducedNum + "/" + reducedDen;
  }

  private int product(ArrayList<Integer> list) {
    int result = 1;
    for (int num : list) {
      result *= num;
    }
    return result;
  }
}
