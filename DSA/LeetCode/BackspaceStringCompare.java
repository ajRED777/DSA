//Question-LeetCode 844. Backspace String Compare:
// Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
// Note that after backspacing an empty text, the text will continue empty.

//Verifying constraints:
//What happens when 2# appear?
////"ab##"->""
//What happens when no chars to delete?-Nothing, just like backspace
//Are two empty strings equal after being typed out?-yes,"ab##"="xy##"
//Does case sensitivity matter?-Yes
import java.util.*;

class BackspaceStringCompare {
  public static void main(String[] args) {

    // Test cases:
    // String stringInput1 = "ab#z";
    // String stringInput2 = "ac#z";

    // String stringInput1 = "AB#Z";
    // String stringInput2 = "ac#z";

    // String stringInput1 = "a#";
    // String stringInput2 = "a#b#c#";

    String stringInput1 = "abz#";
    String stringInput2 = "acz#";

    if (compareBruteForce(stringInput1, stringInput2)) {
      System.out.println("Strings are same when typed out");
    } else {
      System.out.println("Strings are NOT same when typed out");
    }
  }

  public static boolean compareBruteForce(String stringInput1, String stringInput2) {
    return typeOutString(stringInput1).equals(typeOutString(stringInput2));
  }


  //Function to construct typed out string
  public static String typeOutString(String stringInput) {
    //stack to pop and push when required
    Stack<Character> stringChars = new Stack<>();

    //traverse to pop and push char to stack
    for (int i = 0; i < stringInput.length(); i++) {
      char ch = stringInput.charAt(i);

      if (ch != '#') {
        stringChars.push(ch);
      }else{
        if(stringChars.size()!=0)//to avoid empty stack exception
            stringChars.pop();
      }
    }
    return stringChars.toString();

  }

}