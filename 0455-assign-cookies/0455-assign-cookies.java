class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int s_len = s.length;
        int g_len = g.length;

        Arrays.sort(g);
        Arrays.sort(s);

        int content_child = 0;

        // for(int i=0; i<s_len; i++)
        // {
        //     for(int j=0; j<g_len; j++)
        //     {
        //         if(s[i] >= g[j])
        //         {
        //             s[i] = s[i] - g[j];
        //             content_child++;
        //         }
        //     }
        // }

        int i=0; 
        int j=0;
        while(i < s_len && j < g_len)
        {
            if(s[i] >= g[j])
            {
                i++; 
                j++;
                content_child++;
            }
            else 
                i++;
        }

        // int sum_s = 0;

        // for(int i=0; i<s_len; i++)
        // {
        //     sum_s += s[i];
        // }

        // for(int j=0; j<g_len; j++)
        // {
        //     if(g[j] <= sum_s)
        //     {
        //         sum_s -= g[j]; 
        //         content_child++;
        //     }
        // }



        return content_child;
    }
}