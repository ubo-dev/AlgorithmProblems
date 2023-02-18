package problems.easyLeetCode;

public class TwoSum
{
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = nums.length - 1; j > i ; j--) {
                int result = nums[i] + nums[j];
                if (result == target) return new int[]{i,j};
            }
        }
        return nums;
    }
}
