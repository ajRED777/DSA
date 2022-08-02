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
    String stringToCheck = "abccabb";
    // String stringToCheck = "";
    // String stringToCheck = "aaa";
    // String stringToCheck = "abcbda";

    System.out.println("String to be checked is: " + stringToCheck);
    System.out.println("Longest substring count of non repeating chars is: ");
    System.out.println(lengthOfLongestSubstringOptimisedSet(stringToCheck));

  }

  public static int lengthOfLongestSubstringBruteForce(String stringInput) {

    // Time:O(n^2)
    // Space:O(n)

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

  // Sliding Window technique
  // --[---]----
  // --need to look at sequence of small portion of data
  // --sequence of data matters
  // Time:O(n)
  // Space:O(n)
  public static int lengthOfLongestSubstringOptimised(String stringInput) {
    // keep track of current and longest length
    int currentLength = 0;
    int longest = 0;

    // pointer for window
    int right = 0;
    int left = 0;

    // Map to keep track of window chars and their position
    Map<Character, Integer> windowChars = new HashMap<>();

    while (left <= right && right < stringInput.length()) {
      Character currentChar = stringInput.charAt(right);

      // add char to window map if not present and set variables
      if (!windowChars.containsKey(currentChar)) {

        currentLength++;
        windowChars.put(currentChar, right);
        right++;
        longest = Math.max(currentLength, longest);

        // if char present then reset map and variables
      } else {
        currentLength = 0;

        // shifting window from the position of repeated char
        left = windowChars.get(currentChar) + 1;

        windowChars = new HashMap<>();
        right = left;
      }

    }

    return longest;

  }

  // Sliding Window technique
  // --[---]----
  // --need to look at sequence of small portion of data
  // --sequence of data matters
  // Optmisations from previous attempt::
  // Using hashset to remove char one by one until repeated char removed
  //// which reuses same set instead of reseting
  // for looping right pointer
  // left pointer used to remove the repeated char in while loop
  // no variable for current length
  // Time:O(n)
  // Space:O(n)
  public static int lengthOfLongestSubstringOptimisedSet(String stringInput) {

    // keep track of longest length
    int longest = 0;

    // left pointer for window
    int left = 0;

    // Hash Set to keep track of window chars
    HashSet<Character> setWindow = new HashSet<>();

    for (int right = 0; right < stringInput.length(); right++) {

      // while the repeated char exists in set
      while (setWindow.contains(stringInput.charAt(right))) {
        // remove left pointer char from set
        setWindow.remove(stringInput.charAt(left));
        left++;
      }

      // add char to set since no repeated char detected in ^ while loop
      setWindow.add(stringInput.charAt(right));
      // set longest comparing with existing length
      // existing lenth is rigth - left + 1 ( [01]2345 )
      longest = Math.max(longest, right - left + 1);

    }
    return longest;

  }

}