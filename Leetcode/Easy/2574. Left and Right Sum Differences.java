class Solution {
    public int[] leftRigthDifference(int[] nums) {
        
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                left[i] = 0;
            } else {
                left[i] = nums[i-1] + left[i-1];
            }
        }

        for(int i = n - 1; i >= 0; i--) {
            if(i == n - 1) {
                right[i] = 0;
            } else {
                right[i] = nums[i+1] + right[i+1];
            }
        }

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }

        return ans;
    }
}