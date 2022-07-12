
import java.util.*;

class ContainsDuplicate {
  public static void main(String[] args) {
    System.out.println("Checking if the following array has duplicates");
    int[] nums = new int[]{1,1,3,1};
    
     System.out.println(Arrays.toString(nums));
    if(containsDuplicateUsingHash(nums)){
      System.out.println("Contains Duplicates");
    }else{
      System.out.println("DOES NOT Contain Duplicates");
    }
  
  }
  public static boolean containsDuplicateBruteForce(int[] nums){
    // Checking duplicate using brute force
    for(int i=0;i<nums.length;i++){
      for(int j=i+1;j<nums.length;j++){
        if(nums[i]==nums[j]){
          return true;
        }
      }
    }
    return false;
    
  }

  public static boolean containsDuplicateUsingHash(int[] nums){
    // Checking duplicate using hash table
    Set<Integer> uniquesNumSet = new HashSet<>();
    for(int i=0;i<nums.length;i++){
      if(uniquesNumSet.contains(nums[i])){
        System.out.println("Duplicate num in array is "+nums[i]);
        return true;
      }else{
        uniquesNumSet.add(nums[i]);
      }
    }
    return false;

  }
}