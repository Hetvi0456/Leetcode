/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize) 
{
    int *runningSum = (int*)malloc(numsSize*sizeof(int));
    *returnSize = numsSize;
    for(int i=0; i<numsSize; i++)
    {
        runningSum[i]=0;
        for(int j=0; j<=i; j++)
        {
            runningSum[i] += nums[j];
        }
    }   
    return runningSum; 
}