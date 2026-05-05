class Solution {
    public int firstUniqueFreq(int[] nums) {
        int n = nums.length;

        // Find max element
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Create frequency array (size = max + 1)
        ArrayList<Integer> freq = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            freq.add(0);
        }

        // Store frequency of each number
        for (int i = 0; i < n; i++) {
            int value = nums[i];
            freq.set(value, freq.get(value) + 1);
        }

        // Count how many times each frequency appears
        ArrayList<Integer> freqCount = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            freqCount.add(0);
        }

        for (int i = 0; i < freq.size(); i++) {
            int count = freq.get(i);
            if (count > 0) {
                freqCount.set(count, freqCount.get(count) + 1);
            }
        }

        // Print first element in original order
        for (int i = 0; i < n; i++) {
            int value = nums[i];
            int count = freq.get(value);

            if (count > 0 && freqCount.get(count) == 1) {
                return value;
            }
        }
        return -1;
    }
}
