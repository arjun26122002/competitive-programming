class Solution {
    public void moveZeroes(int[] nums) {
         int ps=0;

         for(int i = 0 ; i< nums.length ; i++){
             if(nums[i] != 0){
                 nums[ps] = nums[i];
                 ps++;
             }
         }

         while(ps < nums.length){
             nums[ps++] = 0; 
         }
    }
}