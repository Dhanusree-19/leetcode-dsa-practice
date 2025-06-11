/*
  👩‍💻 Day 3 LeetCode Solution
  ✅ Problem 88: Merge Sorted Array
  Practiced in-place merging of two sorted arrays in Java
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n)
    {
        
        for(int i=0;i<m;i++)
        {
            if(nums1[i]!=0)
            {
                nums1[i]=nums1[i];
            }
        }
        int b=m;
        for(int i=0;i<n;i++)
        {
            
           nums1[b]=nums2[i];
           b++;
            
        }
        int temp;
        for(int i=0;i<m+n;i++)
        {
            for(int j=i+1;j<m+n;j++)
            {
                if(nums1[i]>nums1[j])
                {
                  temp=nums1[i];
                  nums1[i] =nums1[j];
                  nums1[j]=temp;  
                }
            }
        }
        for(int i=0;i<m+n;i++)
        {
            
           System.out.print(nums1[i]+" ");
            
        }

    }
}
