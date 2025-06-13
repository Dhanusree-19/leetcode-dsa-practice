/*
  👩‍💻 Day 5 LeetCode Solutions
  ✅ Problems Solved:
    - 35: Search Insert Position
    - 704: Binary Search
    - 2616: Minimize the Maximum Difference of Pairs

  Solved on my own 💪 — not perfect yet, but I’ll keep learning and improving 🚀
*/

1. class Solution {
    public int searchInsert(int[] nums, int target)
     {
        int start=0;
        int end=nums.length-1;
        int mid=-1;
       while(start<=end)
        {
             mid=start+(end-start)/2;
            if(target<nums[mid])
            {
                end=mid-1;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else 
            {
                return mid;
            }
          }
       return start;
     }
}

2. class Solution {
    public int search(int[] nums, int target) 
    {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target<nums[mid])
            {
                end=mid-1;
            }
            else if(target>nums[mid])
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
            
        }
        return -1;
    }
}

3. class Solution {
    public int minimizeMax(int[] nums, int p) {
        if (p == 0) return 0;
        Arrays.sort(nums);
        int n = nums.length, left = 0, right = nums[n-1] - nums[0];
        while (left < right) {
            int mid = left + (right - left) / 2, pairs = 0;
            for (int i = 1; i < n; i++) {
                if (nums[i] - nums[i-1] <= mid) {
                    pairs++;
                    i++;
                }
            }
            if (pairs >= p) right = mid;
            else left = mid + 1;
        }
        return left;
    }
}
            
        
        

        
