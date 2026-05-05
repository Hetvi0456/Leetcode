/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) 
{
    int *p=(int*)malloc(2*sizeof(int));
    *returnSize = 2;
    int c = 0;
    for(int i=0;i<numsSize;i++)
    {
        for(int j=i+1; j<numsSize; j++)
        {
            if(nums[i] + nums[j] == target)
            {
                p[0] = i;
                p[1] = j;
                c=1;
                break;
            }
        }
        if(c==1)
            break;
    }
    return p;
}
