/*
  👩‍💻 Day 4 LeetCode Solutions
  ✅ Problems Solved:
    - 3423: Given a circular array nums, find the maximum absolute difference between adjacent elements.
    - 1295: Find Numbers with Even Number of Digits
    - 1385: Find the Distance Value Between Two Arrays

  Proudly solved without help 💪 – refining logic and staying consistent ✨
*/

#1  class Solution {
    public int maxAdjacentDistance(int[] nums)
    {
        int max=0;
        int diff;
     
        for (int i=0;i<nums.length-1;i++)
        {
             diff=Math.abs(nums[i]-nums[i+1]);
            if(diff > max)
            {
                max=diff;
            }
           
            
        }
        int m=max;
        int d=Math.abs(nums[nums.length-1]-nums[0]);
        if(d>m)
        {
            m=d;
        }
        return m;
        
    }
}

#2 class Solution {
    public int findNumbers(int[] nums) 
    {
        int ct=0;
       for(int i=0;i<nums.length;i++)
       {
          int dig=0;
          while(nums[i]>0)
          {
            int tmp=nums[i]%10;
            dig++;
            nums[i]/=10;
          }
          int d=dig;
          if(d%2==0)
          {
            ct++;
          }
       }
       return ct; 
    }
}

#3 class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) 
    {
        int a=0;
        
        int f;
        for(int i=0;i<arr1.length;i++)
        {
            int m=0;
           for(int j=0;j<arr2.length;j++)
            {
               f=Math.abs(arr1[i]-arr2[j]);
               if( f> d)
               {
                  m++;

               }
            }
            if(m==arr2.length)
            {
                a++;
            }
        }
        
        return a;
    }
}

