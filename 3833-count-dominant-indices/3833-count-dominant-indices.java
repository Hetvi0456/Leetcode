class Solution {
    public int dominantIndices(int[] nums) {
        int totalsum = 0;
        int count = 0;
        int avg;
        int n = nums.length;

        for(int i=0; i<nums.length; i++)
            {
                totalsum += nums[i];
            }

        for(int i=0; i<nums.length-1; i++)
            {
                totalsum -= nums[i];
                n -= 1;;
                avg = totalsum / n;
                if(nums[i] > avg)
                    count++;
            }
        return count;
    }
}