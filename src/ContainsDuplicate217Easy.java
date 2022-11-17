import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate217Easy {

        public static boolean containsDuplicateSolution1(int[] nums) {

            Arrays.sort(nums);
            for (int i=1; i<nums.length; i++){
                if(nums[i-1]==nums[i]){
                    return true;
                }
            }
            return false;
        }

        public static boolean containsDuplicateSolution2(int[] nums) {
            Set<Integer> uniqNums = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (uniqNums.contains(nums[i])) {
                    return true;
                }else uniqNums.add(nums[i]);
            }
            return false;
        }


        public static void main(String[] args){

            int [] nums = {1,1,1,3,3,4,3,2,4,2};

            System.out.println(containsDuplicateSolution1(nums));
            System.out.println(containsDuplicateSolution2(nums));
        }

    }




   /* Given an integer array nums, return true if any value appears at least twice in the array,
      and return false if every element is distinct.

        Example 1:
        Input: nums = [1,2,3,1]
        Output: true

        Example 2:
        Input: nums = [1,2,3,4]
        Output: false

        Example 3:
        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true

        Constraints:
        1 <= nums.length <= 105
        -109 <= nums[i] <= 109  */