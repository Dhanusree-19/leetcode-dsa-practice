/*
  👩‍💻 Day 2 LeetCode Solutions
  ✅ Problems Solved:
  - #26 Remove Duplicates from Sorted Array
  - #27 Remove Element
*/
#1 class Solution {
    public int removeDuplicates(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
        
    }
}

#2 class Solution {
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k;
        
    }
}
