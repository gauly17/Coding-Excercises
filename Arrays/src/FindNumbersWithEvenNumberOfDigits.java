
/* Given an array nums of integers, return how many of them contain an even number of digits */

public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            String str = Integer.toString(n);
            if(str.length() % 2 ==0){
                count++;
            }
        }
        return count;
    }
}
