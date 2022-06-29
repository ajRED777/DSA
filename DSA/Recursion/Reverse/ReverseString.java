import java.util.*;

class ReverseString {
  public static void main(String[] args) {
    
    Scanner scanner= new Scanner(System.in); 
    System.out.print("\nEnter the string to be reversed: ");  
    String stringToBeReversed= scanner.nextLine();              
    System.out.println("You have entered: "+stringToBeReversed);

    //Reversing String thru Brute force approach
    long startTime=0;
    long endTime=0;
    startTime = System.nanoTime();
    System.out.println("\nString reverse thru brute force method is : ");
    System.out.println(reverseStringBruteForce(stringToBeReversed));
    endTime = System.nanoTime();
    long bruteForceDuration = (endTime - startTime);
    System.out.println("Brute force duration: "+bruteForceDuration+"ns");

    startTime=0;
    endTime=0;
    startTime = System.nanoTime();
    System.out.println("\nString reverse thru recursion method is : ");
    System.out.println(reverseStringBruteForce(stringToBeReversed));
    endTime = System.nanoTime();
    long recursionDuration = (endTime - startTime);
    System.out.println("Recursion duration: "+recursionDuration+"ns");
    
    scanner.close();
  }

  public static String reverseStringBruteForce(String stringToBeReversed){
    String stringReversed= "";
    int stringLength = stringToBeReversed.length();
    for (int i = stringLength-1; i >= 0; i--) {
 
            System.out.print(stringReversed + stringToBeReversed.charAt(i));
    }
    return stringReversed;
  }
  public static String reverseStringRecursion(String stringToBeReversed){
    String stringReversed= "";
    return stringReversed;
  }
}