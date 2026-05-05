int totalMoney(int n) {
    int x=1;
    int y=1;
    int count=0;
    int result=0;
    for(int a=1; a<=n; a++)
    {
        result += x;
        x++;
        count++;
        if(count == 7)
        {
            y++;
            x=y;
            count=0;
        }
    }
    return result;
}