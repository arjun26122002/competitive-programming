class Solution {
    public int majorityElement(int[] nums) {
       int n = nums.length ;
       HashMap<Integer,Integer> map = new HashMap <Integer,Integer>();
       for(int i = 0 ; i < n ; i++){
           if(map.containsKey(nums[i]))
           {
               int count = map.get(nums[i]) + 1 ;
               if(count > n / 2)
               {
                   return nums[i];
               }
               else
               {
                   map.put(nums[i] , count);
               }
           }
           else
           {
               map.put(nums[i] , 1);
           }
       }

    return 1;

    
        
    }
}