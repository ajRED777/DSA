//Question-Leetcode 3. Longest Substring Without Repeating Characters:
//Given a string s, find the length of the longest substring without repeating characters.

//Verifying constraints:
//The substring must be contigous?-Yes, Subsequences not considered

//Test cases:
//"ccc"-1
//""-0
//"abcbda"- 4(cbda)
import java.util.*;

class LongestSubstringWithoutRepeatingCharacters {
  public static void main(String[] args) {

    System.out.println("Longest Substring Without Repeating Characters");
    // String stringToCheck = "abccabb";
    // String stringToCheck = "";
    // String stringToCheck = "aaa";
    String stringToCheck = "abcbda";

    System.out.println("String to be checked is: " + stringToCheck);
    System.out.println("Longest substring count of non repeating chars is: ");
    System.out.println(lengthOfLongestSubstringBruteForce(stringToCheck));

  }

  public static int lengthOfLongestSubstringBruteForce(String stringInput) {

    // handle edge cases
    if (stringInput.length() <= 1) {
      return stringInput.length();
    }
    //
    // keep track of length
    int longest = 0;

    // left pointer moving to check new substring
    for (int left = 0; left < stringInput.length(); left++) {
      // resetting the seen char when repitition found
      Set<Character> seenChars = new HashSet<>();
      // resetting the current length
      int currentLength = 0;

      // right pointer moving to populate sub string without repitition in seen chars
      for (int right = left; right < stringInput.length(); right++) {
        char currentChar = stringInput.charAt(right);

        // if current char is not in seen chars then add and increment
        if (!seenChars.contains(currentChar)) {
          seenChars.add(currentChar);
          currentLength++;
          longest = Math.max(currentLength, longest);
        } else {
          break;
        }
      }
    }
    return longest;
  }

  public static int lengthOfLongestSubstringOptimised(String stringInput) {
    // keep track of length
    int longest = 0;

    return longest;

  }

}