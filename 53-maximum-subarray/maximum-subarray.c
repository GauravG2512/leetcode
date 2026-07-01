int maxSubArray(int* nums,int numsSize){
int s=0,m=nums[0];
for(int i=0;i<numsSize;i++){
s+=nums[i];
if(s>m)m=s;
if(s<0)s=0;
}
return m;
}