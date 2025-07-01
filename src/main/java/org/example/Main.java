package org.example;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println(isPalindrome(-707));
    System.out.println(isPerfectNumber(28));
    System.out.println(numberToWords(17));
    System.out.println(numberToWords(123));
  }

  public static boolean isPalindrome(int number) {
    number = Math.abs(number);

    int originalNumber = number;
    int reversedNumber = 0;

    while (number != 0) {
      int digit = number % 10;
      reversedNumber = reversedNumber * 10 + digit;
      number /= 10;
    }

    return originalNumber == reversedNumber;
  }

  public static boolean isPerfectNumber(int number) {
    int sum = 0;
    if(number < 0) {
      return false;
    }
    else {
      for(int i=1; i<number; i++) {
        if(number % i == 0) {
          sum += i;
        }
      }
      return sum == number;
    }
  }

  public static String numberToWords(int num) {
    String newNumber = "";
    if(num < 0) {
      return "Invalid Value";
    }
    else {
      String stringified = String.valueOf(num);
      for(int i=0; i<stringified.length(); i++) {
        switch(stringified.charAt(i)) {
          case '0':
            newNumber = newNumber+" Zero";
            break;
          case '1':
            newNumber = newNumber+" One";
            break;
          case '2':
            newNumber = newNumber+" Two";
            break;
          case '3':
            newNumber = newNumber+" Three";
            break;
          case '4':
            newNumber = newNumber+" Four";
            break;
          case '5':
            newNumber = newNumber+" Five";
            break;
          case '6':
            newNumber = newNumber+" Six";
            break;
          case '7':
            newNumber = newNumber+" Seven";
            break;
          case '8':
            newNumber = newNumber+" Eight";
            break;
          case '9':
            newNumber = newNumber+" Nine";
            break;
        }
      }
    }
    return newNumber.trim();
  }
}
