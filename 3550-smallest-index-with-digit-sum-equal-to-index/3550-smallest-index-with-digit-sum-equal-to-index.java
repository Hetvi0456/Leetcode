class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        // int ans = -1;
        for(int i=0; i<n; i++)
        {
            int digitSum = 0;
            int number = nums[i];
            while(number != 0)
            {
                digitSum += number % 10;
                number /= 10;
            }

            if(i==digitSum)
                return i;
        }
        return -1;
    }
}