class Solution {
    public int countKDifference(int[] nums, int k) {
        int n = nums.length;
        int diff = 0;
        int count = 0;
        for(int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                diff = Math.abs(nums[i] - nums[j]);
                if(diff == k)
                    count++;
            }
        }
        return count;
    }
}