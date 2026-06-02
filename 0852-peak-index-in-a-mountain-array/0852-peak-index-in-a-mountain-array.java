class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int peak = 0;
        int mid = 0;

        while(start < end)
        {
            mid = start + (end - start) / 2;

            if(arr[mid-1] < arr[mid] )
            {
                if(arr[mid] > arr[mid+1])
                {
                    peak = mid;
                    break;
                }
                else 
                {
                    start = mid + 1;
                }
            }
            else 
            {
                if(arr[mid] > arr[mid+1])
                {
                    end = mid;
                }
            }
        }
        return peak;
    }
}