class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for ( int i : nums){
            boolean unique = uniqueElement(i , nums);
            if(unique) sum += i;
        }

         return sum;
    }

    public boolean uniqueElement( int num , int [] array){
        int count = 0;

        for( int i : array ){
            if ( i == num ) ++count;

            if(count > 1) return false; 
        }

        return true;

    }
}