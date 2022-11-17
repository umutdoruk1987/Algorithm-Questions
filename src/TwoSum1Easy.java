public class TwoSum1Easy {

    public static int[] twoSumSolution1(int[] nums, int target) {

        int [] toReturn = new int[2];

        for (int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    toReturn[0]=i;
                    toReturn[1]=j;
                    return toReturn;
                }
            }
        }
        return toReturn;
    }

    public static void main(String[] args) {
        int [] nums1 = {2,7,11,15} ;
        int target1 = 9;
        int[] temp1 = twoSumSolution1(nums1,target1);
        System.out.println(temp1[0]+" "+temp1[1]);

        int [] nums2 = {3,2,4} ;
        int target2 = 6;
        int[] temp2 = twoSumSolution1(nums2,target2);
        System.out.println(temp2[0]+" "+temp2[1]);

        int [] nums3 = {3,3} ;
        int target3 = 6;
        int[] temp3 = twoSumSolution1(nums3,target3);
        System.out.println(temp3[0]+" "+temp3[1]);

    }

}



    /*Given an array of integers nums and an integer target, return indices of the two numbers
      such that they add up to target.
      You may assume that each input would have exactly one solution, and you may not use the
      same element twice.
      You can return the answer in any order.

        Example 1:
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

        Example 2:
        Input: nums = [3,2,4], target = 6
        Output: [1,2]

        Example 3:
        Input: nums = [3,3], target = 6
        Output: [0,1]

        Constraints:
        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
        Only one valid answer exists.*/