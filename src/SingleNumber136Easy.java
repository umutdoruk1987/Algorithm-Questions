import java.util.ArrayList;

public class SingleNumber136Easy {

    public int singleNumber(int[] nums) {

        int sum = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (arrayList.contains(nums[i])) {
                sum -= nums[i];
            } else {
                arrayList.add(nums[i]);
                sum += nums[i];
            }
        }
        return sum;
    }
}