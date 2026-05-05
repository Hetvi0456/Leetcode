class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> li = new ArrayList<>();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||
                s.charAt(i)=='o' || s.charAt(i)=='u' ||
                s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' ||
                s.charAt(i)=='O' || s.charAt(i)=='U')
                {
                    li.add(s.charAt(i));
                }
        }

        Collections.reverse(li);

        char[] arr = s.toCharArray();
        int index = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' ||
                arr[i]=='o' || arr[i]=='u' ||
                arr[i]=='A' || arr[i]=='E' || arr[i]=='I' ||
                arr[i]=='O' || arr[i]=='U')
            {
                arr[i] = li.get(index);
                index++;
            }
        }

        return new String(arr);
    }
}