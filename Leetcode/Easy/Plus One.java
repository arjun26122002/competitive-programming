class Solution {
    public int[] plusOne(int[] digits){

        int n = digits.length - 1;
        int p = digits.length + 1;

        while(n >= 0){
            if(digits[n] == 9) 
            digits[n] = 0;
            else
            { 
                digits[n] += 1; 
                return digits;
            }
            n--;
        }

        int [ ] res = new int [p];
        res[0] = 1;
        return res; 
   
    }
}