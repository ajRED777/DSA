import java.util.*;

class ReverseString {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("\nEnter the string to be reversed: ");
    String stringToBeReversed = scanner.nextLine();
    System.out.println("You have entered: " + stringToBeReversed);

    // Reversing String thru Brute force approach
    float startTime = 0;
    float endTime = 0;

    startTime = System.nanoTime();
    System.out.print("\nString reversed thru brute force method is : ");
    System.out.println(reverseStringBruteForce(stringToBeReversed));
    endTime = System.nanoTime();

    float bruteForceDuration = (endTime - startTime) / 1000000;
    System.out.println("Brute force duration: ");
    System.out.printf("%.10f\n", bruteForceDuration);

    // Reversing String thru Recursion approach
    startTime = 0;
    endTime = 0;

    startTime = System.nanoTime();
    System.out.print("String reversed thru recursion method is : ");
    System.out.println(reverseStringBruteForce(stringToBeReversed));
    endTime = System.nanoTime();

    float recursionDuration = (endTime - startTime) / 1000000;
    System.out.println("Recursion duration: ");
    System.out.printf("%.10f\n", recursionDuration);
    scanner.close();
  }

  public static String reverseStringBruteForce(String stringToBeReversed) {
    String stringReversed = "";

    int stringLength = stringToBeReversed.length();
    for (int i = stringLength - 1; i >= 0; i--) {

      System.out.print(stringReversed + stringToBeReversed.charAt(i));
    }

    return stringReversed;
  }

  public static String reverseStringRecursion(String stringToBeReversed) {
    // base condition
    if (stringToBeReversed == "") {
      return stringToBeReversed;
    } else {
      return reverseStringRecursion(stringToBeReversed.substring(1)) + stringToBeReversed.charAt(0);
    }

  }
}