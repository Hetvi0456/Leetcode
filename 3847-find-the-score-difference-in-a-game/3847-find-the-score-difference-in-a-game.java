class Solution {
    public int scoreDifference(int[] nums) {
        int player1 = 0;
        int player2 = 0;
        int turn = 1;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]%2 != 0)
            {
                if(turn==1) 
                    turn=2;
                else if(turn==2)
                    turn = 1;
            }

            if(i%6 == 5)
            {
                if(turn==1) 
                    turn=2;
                else if(turn==2)
                    turn = 1;
            }

            if(turn == 1)
                player1+=nums[i];
            else 
                player2 += nums[i];
        }

        return player1 - player2;
    }
}