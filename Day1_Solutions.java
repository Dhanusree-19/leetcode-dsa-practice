/*
  👩‍💻 Day 1 LeetCode Solutions
  ✅ Problems Solved: 
    - #1 Two Sum
    - #9 Palindrome Number
*/
#1 class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};  
    }
}

#2 class Solution {
    public boolean isPalindrome(int x) {
         int temp=x;
         int  rev=0;
        while(temp>0)
        {
           int a=temp%10;
            rev=rev*10+a;
            temp=temp/10;
        }
        
        return rev==x;
    }
}
