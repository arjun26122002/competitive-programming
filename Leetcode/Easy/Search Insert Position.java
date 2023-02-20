class Solution {
    public int searchInsert(int[] arr, int target) {
        int n = arr.length - 1 ;
    for(int i = 0; i <= n; i++){
          if (arr[i] == target){
          	return i;
          	
          }
          else if (arr[i] > target ){
          	n = i - 1 ;
          }

    }
    return n + 1 ;
    }
         
    
}