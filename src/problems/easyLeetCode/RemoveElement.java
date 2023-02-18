package problems.easyLeetCode;

public class RemoveElement
{
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
            {
                nums[i] = -1;
                k++;
            }
        }

        for (int i : nums) {
            System.out.println(i);
        }


        return k;
    }
}
