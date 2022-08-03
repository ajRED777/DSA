import java.util.*;

//Question-LeetCode 125. Valid Palindrome:
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.

//1.Verify the constraints:
////Are all nos +ve or can there be -ves?-> All nos are positive
////Can String be empty?-> yes, return true
////Can String have just 1 char?-> yes, return true
////Ignore space and alphanumeric chars?-> yes

//variations
////start left and right pointers from far ends
////start left and right pointers from middle
////compare reversed string with actual string
class ValidPalindrome {
  public static void main(String[] args) {
    System.out.println("Check if string is palindrome");
    // 2.Test cases
    // String stringInput = "";
    // String stringInput = "a";
    // String stringInput = "aba";
    // String stringInput = "abba";
    // String stringInput = "abc";
    // String stringInput = "AbBa";
    String stringInput = "A man, a plan, a canal: Panama";

    System.out.println("String to be evaluated:");
    System.out.println(stringInput);

    if (checkIfPalindrome2PointerWithoutRegx(stringInput)) {
      System.out.println(stringInput + " is a Palindrome");
    } else {
      System.out.println(stringInput + " is not a Palindrome");
    }

  }

  public static boolean checkIfPalindrome2Pointer(String stringInput) {

    // replace everything except a-zA-Z with ""
    stringInput = stringInput.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

    int right = stringInput.length() - 1;
    int left = 0;

    while (right > left) {

      if (stringInput.charAt(left) != stringInput.charAt(right)) {
        return false;
      }
      right--;
      left++;
    }

    return true;
  }

  // Regex slowed down the operation
  public static boolean checkIfPalindrome2PointerWithoutRegx(String stringInput) {

    int right = stringInput.length() - 1;
    int left = 0;

    while (right > left) {
      Character leftChar = stringInput.charAt(left);
      Character rightChar = stringInput.charAt(right);

      if (!Character.isLetterOrDigit(leftChar)) {
        left++;
        continue;
      }

      if (!Character.isLetterOrDigit(rightChar)) {
        right--;
        continue;
      }

      if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
        return false;
      }
      right--;
      left++;
    }

    return true;
  }

  // public static boolean checkIfPalindromeRecursion(String stringInput) {

  // if (stringInput.length() == 1 || stringInput.equals("")) {
  // return true;
  // }
  // if (stringInput.charAt(0) == stringInput.charAt(stringInput.length() - 1)) {
  // return checkIfPalindromeRecursion(stringInput.substring(1,
  // stringInput.length() - 2));
  // } else {
  // return false;
  // }

  // }

}