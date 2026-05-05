int addDigits(int num) {
    int sum = 0 ;
    int temp = num;
    
        while(temp>0)
        {
            int y = temp % 10;
            sum = sum + y;
            temp = temp / 10;
        }
        while(sum>9)
        {
            int x = sum;
            sum = 0;
            while(x>0)
            {
                int y = x%10;
                sum = sum + y;
                x = x / 10;
            } 
        }
        
    
    return sum;
}