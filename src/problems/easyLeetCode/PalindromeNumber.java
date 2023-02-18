package problems.easyLeetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber
{
    public boolean isPalindrome(int x) {

        String s = Integer.toString(x);
        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            if (s.toCharArray()[left] != s.toCharArray()[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
