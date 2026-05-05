bool isArraySpecial(int* nums, int numsSize) 
{
    for(int i=0; i<numsSize; i++)
    {
        if(i+1==numsSize)
            break;
        else if(nums[i]%2==0)
        {
            if(nums[i+1]%2==0)
                return 0;
        }
        else
        {
            if(nums[i+1]%2 != 0)
                return 0;
        }
    }
    return 1;
}