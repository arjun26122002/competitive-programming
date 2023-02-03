class Solution {
    public int differenceOfSum(int[] nums) {
        int digSum = 0;
        int eleSum = 0;
        // while(number > 0){
        //     digit = number % 10;
        //     sum = sum + digit ;
        //     number = numer / 10 ;
        for ( int i = 0; i < nums.length; i++){
        eleSum  += nums[i];
        
         while(nums[i] > 9){
            digSum += nums[i] % 10 ;
            nums[i] /= 10;
         }  

         if( nums[i] <= 9){
           digSum += nums[i];  

         }

        }

        return Math.abs( eleSum - digSum);
    }
}
