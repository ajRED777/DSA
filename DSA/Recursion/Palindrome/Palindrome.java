import java.util.*;

/*
Problem: Check input string is a palindrome
*/

class Palindrome {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the string to be checked if palindrome: ");
    String inputString = scanner.nextLine();
    System.out.println("You have entered: " + inputString);

    // Checking palindrom using brute force
    float startTime = 0;
    float endTime = 0;

    startTime = System.nanoTime();
    System.out.print("\nBrute force method  :::::::: ");
    if(checkPalindromeBruteForce(inputString)){
      System.out.print(inputString+" is a palindrome");
    }else{
      System.out.print(inputString+" is NOT a palindrome");
    }
    endTime = System.nanoTime();

    float bruteForceDuration = (endTime - startTime) / 1000000;
    System.out.println("Brute force duration: ");
    System.out.printf("%.10f\n", bruteForceDuration);

    // Checking palindrom using recursion
    startTime = 0;
    endTime = 0;

    startTime = System.nanoTime();
    System.out.print("\nRecursion method  :::::::: ");
    if(checkPalindromeRecursion(inputString)){
      System.out.print(inputString+" is a palindrome");
    }else{
      System.out.print(inputString+" is NOT a palindrome");
    }
    endTime = System.nanoTime();

    float recursionDuration = (endTime - startTime) / 1000000;
    System.out.println("Recursion duration: ");
    System.out.printf("%.10f\n", recursionDuration);
    scanner.close();
  }

  public static boolean checkPalindromeBruteForce(String input) {
    return true;
  }

  public static boolean checkPalindromeRecursion(String input) {
    // base condition
    return true;

  }
}