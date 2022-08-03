import java.util.*;

//Question-LeetCode 125. Valid Palindrome:
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.

//1.Verify the constraints:
////Are all nos +ve or can there be -ves?-> All nos are positive
////Can String be empty?-> yes, return true
////Can String have just 1 char?-> yes, return true
////Ignore space and alphanumeric chars?-> yes

class ValidPalindrome {
  public static void main(String[] args) {
    System.out.println("Check if string is palindrome");
    // Test cases
    // string stringInput = "";
    // string stringInput = "a";
    // string stringInput = "aba";
    string stringInput = "abba";

    System.out.println("String to be evaluated:");
    System.out.println(stringInput);

    if (checkIfPalindrome(stringInput)) {
      System.out.println(stringInput + " is a Palindrome");
    } else {
      System.out.println(stringInput + " is not a Palindrome");
    }

  }

  public static boolean checkIfPalindrome(string stringInput) {

    return true;
  }

}