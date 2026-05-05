class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++)
        {
            long value = nums[i];
            while(list.size() > 0 && list.get(list.size()-1) == value)
            {
                list.remove(list.size()-1);
                value *= 2;
            }
            list.add(value);
        }
        return list;
    }
}