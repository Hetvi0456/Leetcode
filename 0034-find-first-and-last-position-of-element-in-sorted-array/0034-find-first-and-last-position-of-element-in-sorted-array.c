/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) 
{
    int *p = (int*)malloc(2*sizeof(int));
    *returnSize=2;
    p[0]=-1;
    p[1]=-1;
    for(int i=0; i<numsSize; i++)
    {
        if(nums[i]==target)
        {
            p[0]=i;
            break;
        }
    }    
    for(int i=numsSize-1; i>=0; i--)
    {
        if(nums[i]==target)
        {
            p[1]=i;
            break;
        }
    }
    return p;
}