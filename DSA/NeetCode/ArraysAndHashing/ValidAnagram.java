
import java.util.*;

class ValidAnagram {
  
  public static void main(String[] args) {
    
    System.out.println("Checking if the following 2 strings are a valid anagram");
    String string1 = "car";
    String string2 = "rat";
    
    System.out.println("1st string is " + string1);
    System.out.println("2nd string is " + string2);
    
    if(checkAnagramUsingHash(string1, string2)){
      System.out.println("Valid Anagram confirmed");
    }else{
      System.out.println("Not a Valid Anagram");
    }
  
  }
  public static boolean checkAnagramBruteForce(String string1, String string2){
    // Checking anagram using brute force
    System.out.println("Checking anagram using brute force...");
    //logic starts---
    
    return false;
    //---logic ends
    
  }

  //my attempt
  public static boolean checkAnagramUsingHash(String string1, String string2){
    // Checking anagram using hash table
    System.out.println("Checking anagram using hash table...");
    //logic starts...

    //1.Check if strings are of same length
    if(string1.length()!=string2.length()) return false;
    
    //2.Populate char count of 1st string to hash map
    HashMap<Character,Integer> charCountMap = new HashMap<>();
    for(int i=0;i<string1.length();i++){
      Character character = string1.charAt(i);
      Integer charCount = charCountMap.get(character);
      
      if(charCount==null){
        charCountMap.put(character, 1);
      }else{
        charCountMap.put(character, ++charCount);
      }
    }

    //3.Check 2nd string with hash map
    for(int i=0;i<string2.length();i++){
      Character character = string2.charAt(i);
      Integer charCount = charCountMap.get(character);
      if(charCount==null||charCount==0){
        return false;
      }else{
        charCountMap.put(character, --charCount);
      }
    }

    //4.Check if any value in hasmap is greater than 0
    for (Map.Entry<Character, Integer> set :charCountMap.entrySet()) {
      if(set.getValue()>0)
        return false;
    }
    return true;
    //...logic ends
    
  }
}