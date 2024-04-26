import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;

    }
}

public class Find_Duplicate_in_Array {
    public static void main(String[] args) {

        Solution obj1 = new Solution();

        int[] nums = { 1, 2, 3, 4 };

        obj1.containsDuplicate(nums);

    }
}
