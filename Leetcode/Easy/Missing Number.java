class Solution {
    public int missingNumber(int[] nums){
    int n = nums.length;
    int e = n *( n + 1) / 2 ;
    int a = 0 ;
    for ( int i : nums){
        a += i ;
    }

     return e - a ;
    }
     
}