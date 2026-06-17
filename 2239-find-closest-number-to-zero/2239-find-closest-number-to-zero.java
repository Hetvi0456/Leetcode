class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);
        ArrayList<Integer> li = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            int diff = Math.abs(nums[i]-0);
            if(diff<=min)
            {
                min = Math.abs(diff);
                li.add(nums[i]);
            }
        }

        Collections.sort(li, Collections.reverseOrder());
        return li.get(0);
    }
}