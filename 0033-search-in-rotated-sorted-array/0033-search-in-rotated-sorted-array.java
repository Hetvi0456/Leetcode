class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high =  nums.length-1;
        int n = nums.length;
        int peak = 0;
        int mid = 0;

        while(low <= high)
        {
            mid = low + (high - low) / 2;

            if(nums[mid] >= nums[0])
            {
                peak = mid;
                low = mid + 1;
            }
            else 
                high = mid - 1;
        }

        low = 0;
        high = peak;

        while(low<=high)
        {
            mid = low + (high-low) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target)
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }

        low = peak + 1;
        high = n - 1;

        while(low <= high)
        {
            mid = low + (high - low) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if (nums[mid] < target)
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}