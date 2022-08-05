import java.util.*;

//Question-LeetCode 680. Valid Palindrome II:
//Given a string s, return true if the s can be palindrome after deleting at most one character from it.

//complications:
//Decision of ignoring which char to form a palindrome:
//  "abccdba"
//when appraching using 2 pointers from ends
//"ab [c] c [d] ba"
//we have to decide whether to ignore 'c' or 'd'

//1.Verify the constraints:
////Can String be empty?-> yes, return true
////Can String have just 1 char?-> yes, return true
////Ignore space and non alphanumeric chars?-> yes
////return true if already a palindrome? ->yes

class AlmostPalindrome {
  public static void main(String[] args) {
    System.out.println("Check if string is almost a palindrome");
    // 2.Test cases
    // String stringInput = "";
    // String stringInput = "a";
    // String stringInput = "aba";
    // String stringInput = "abc";
    String stringInput = "AbBa";

    // String stringInput = "ab";
    // String stringInput = "raceacar";
    // String stringInput = "abccdba";
    // String stringInput = "abcdefdba";
    // String stringInput = "A man, a plan, a canal: Panama";

    System.out.println("String to be evaluated:");
    System.out.println(stringInput);

    if (checkIfAlmostPalindromeAttempt(stringInput)) {
      System.out.println(stringInput + " is almost Palindrome");
    } else {
      System.out.println(stringInput + " is not almost Palindrome");
    }

  }

  public static boolean checkIfAlmostPalindromeAttempt(String stringInput) {
    int right = stringInput.length() - 1;
    int left = 0;

    while (right > left) {
      Character leftChar = stringInput.charAt(left);
      Character rightChar = stringInput.charAt(right);

      // move pointers if not a alphanumeric
      if (!Character.isLetterOrDigit(leftChar)) {
        left++;
        continue;
      }
      if (!Character.isLetterOrDigit(rightChar)) {
        right--;
        continue;
      }

      if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
        return checkSubstringPalindrome(stringInput, left + 1, right)
            || checkSubstringPalindrome(stringInput, left, right - 1);
      }
      right--;
      left++;
    }

    return true;
  }

  public static boolean checkSubstringPalindrome(String stringInput, int left, int right) {

    while (right > left) {
      Character leftChar = stringInput.charAt(left);
      Character rightChar = stringInput.charAt(right);

      // move pointers if not a alphanumeric
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

}