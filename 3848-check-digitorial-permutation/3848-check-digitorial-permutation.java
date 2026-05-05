class Solution {
    int fact(int num)
    {
        if (num == 0 || num == 1)
        return 1;

        return num * fact(num - 1);
    }
    public boolean isDigitorialPermutation(int n) {
        int original = n;
        int desired = 0;
        while(original != 0)
        {
            int digit = original % 10;
            original /= 10;

            desired += fact(digit);
        }

        char[] arr1 = String.valueOf(n).toCharArray();
        char[] arr2 = String.valueOf(desired).toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}