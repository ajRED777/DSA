
import java.util.*;

//Question-LeetCode 1.Two Sum:
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

//1.Verify the constraints:
////Are all nos +ve or can there be -ves?-> All nos are positive
////Are there duplicate nos in the array?-> No
////Will there always be a solution available?-> No
/////What to return when no solution?    -> null
////Can there be multiple pairs that add up to target -> No    

class TwoSum {
  public static void main(String[] args) {
    System.out.println("Checking if array has integrs with target sum");
    int[] nums = new int[] { 1, 2, 3, 4 };
    int targetSum = 5;
    System.out.println(Arrays.toString(checkTwoSumBruteForce(nums, targetSum)));

  }

  
  public static int[] checkTwoSumBruteForce(int[] nums,int targetSum) {
    // Checking 2 sum using brute force
    System.out.println("Checking 2 sum using brute force...");
    // logic starts...
    int[] twoSumIndexes = new int[2];
    int length = nums.length;
    //1.Check if array is empty
    if(length == 0){
      return twoSumIndexes;
    }
    //2.Check sum each element with other elements
    for(int i=0;i<length-1;i++){
      for(int j=i+1;j<length-1;j++){
        if(nums[i]+nums[j]==targetSum){
          return twoSumIndexes = new int[] { i,j };
        }
      }
    }
    return twoSumIndexes;
    // ...logic ends

  }
  
  public static int[] checkTwoSumUsingHash(int[] nums,int targetSum) {
    // Checking 2 sum using hash table
    System.out.println("Checking 2 sum using hash set...");
    // logic starts...
    int[] twoSumIndexes = new int[2];

    return twoSumIndexes;
    // ...logic ends

  }
}