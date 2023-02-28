
class Solution {
public int searchInsert(int[] nums, int target) {
int a =0;
int c=0;
boolean b = false;
for(int i=0;i<nums.length;i++)
{
if(nums[i]==target)
{
a =i;
b = true;
break;
}

        }
if(b==true)
     c = a;
else
{
for(int i=0;i<nums.length;i++)
{
if(nums[i]>target)
{
a= i;
break;
}
else
a=i+1;
}
c=a;
}
return c;
}
}

    
