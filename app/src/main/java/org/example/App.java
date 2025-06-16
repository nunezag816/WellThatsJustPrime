package org.example;

public class App {
  public static void main(String[] args) {
    Factorizer factorizer = new Factorizer();

    System.out.println("Prime factors of 0: " + factorizer.primeFactors(0));
    System.out.println("Prime factors of 1: " + factorizer.primeFactors(1));
    System.out.println("Prime factors of 9: " + factorizer.primeFactors(9));
    System.out.println("Prime factors of 10: " + factorizer.primeFactors(10));
    System.out.println("Prime factors of 17: " + factorizer.primeFactors(17));

    System.out.println("Is 17 prime? " + factorizer.isPrime(17));
    System.out.println("Is 1 prime? " + factorizer.isPrime(1));
    System.out.println("Is 0 prime? " + factorizer.isPrime(0));
    System.out.println("Is 36 prime? " + factorizer.isPrime(36));

    System.out.println("Is 36 composite? " + factorizer.isComposite(36));
    System.out.println("Is 17 composite? " + factorizer.isComposite(17));
    System.out.println("Is 1 composite? " + factorizer.isComposite(1));
    System.out.println("Is 0 composite? " + factorizer.isComposite(0));

    System.out.println("Reduce 36/12: " + factorizer.reduce(36, 12));
    System.out.println("Reduce 12/12: " + factorizer.reduce(12, 12));
    System.out.println("Reduce 12/14: " + factorizer.reduce(12, 14));
    System.out.println("Reduce 12/37: " + factorizer.reduce(12, 37));
    System.out.println("Reduce -12/14: " + factorizer.reduce(-12, 14));
  }
}
