import java.util.*;

//Question-LeetCode 11.Container With Most Water:
//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//Find two lines that together with the x-axis form a container, such that the container contains the most water.
//Return the maximum amount of water a container can store.
//***Additional:And the container heights

//1.Verify the co nstraints:
////Are all nos +ve or can there be -ves?-> All nos are positive
////Can Array be empty?-> yes
////Can Array have just 1 value?-> No
//Does thickness of line affect area?-> No
//Does line in between interfere with area?-> No
//Sides cannot be used to form container-> true

class ContainerWithMostWater {
  public static void main(String[] args) {
    System.out.println("Getting indices in array that form the largest water container");
    int[] nums = new int[] { 11, 4, 5, 31, 1, 3, 8 };
    System.out.println("Values that form largest container");
    int[] sides = containerWithMostWaterTwoPointers(nums);
    System.out.println(sides[0] + "," + sides[1]);
    System.out.println("Largest Container Area Possible");
    System.out.println(sides[2]);

  }

  public static int[] containerWithMostWaterBruteForce(int[] nums) {
    // Checking 2 sum using brute force
    System.out.println("Getting Container With Most Water using brute force...");
    // logic starts...

    int[] sides = null;
    int largestArea = 0;

    // for(i->nums.len-1)
    // side1 = nums[i]
    // for(i+1->nums.len-1)
    // side2=nums[j]
    // check if min(side1,side2)*(j-1) is largest area

    for (int i = 0; i < nums.length; i++) {
      // O(n)
      int side1 = nums[i];
      for (int j = i + 1; j < nums.length; j++) {
        // O(n*n)
        int side2 = nums[j];
        int height = Math.min(side1, side2);
        int currentArea = height * (j - i);
        if (currentArea > largestArea) {
          largestArea = currentArea;
          sides = new int[] { nums[i], nums[j], largestArea };
        }
      }
    }

    return sides;
    // ...logic ends

  }

  public static int[] containerWithMostWaterTwoPointers(int[] nums) {
    // Checking 2 sum using brute force
    System.out.println("Getting Container With Most Water using two pointers...");
    // logic starts...

    int[] sides = null;
    int largestArea = 0;

    // pointer2=nums.len-1
    // for (int i = 0; i > 0; i++)
    // pointer1=nums[i]

    // check min(pointer1,pointer2) * ()
    int leftPointer = 0;
    int rightPointer = nums.length - 1;

    while (leftPointer < rightPointer) {
      int currentArea = Math.min(nums[leftPointer], nums[rightPointer]) * (rightPointer - leftPointer);
      largestArea = Math.max(currentArea, largestArea);
      sides = new int[] { nums[leftPointer], nums[rightPointer], largestArea };
      int p = (nums[leftPointer] < nums[rightPointer]) ? leftPointer++ : rightPointer--;
    }

    return sides;
    // ...logic ends

  }
}