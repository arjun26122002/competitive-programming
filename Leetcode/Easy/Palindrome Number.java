class Solution {
    public boolean isPalindrome(int x) {
        int r,sum=0 ;

        if ( x == 0) return true;
        if ( x < 0 || x % 10 == 0) return false;

        int temp=x;
        while(x > 0){
            r= x % 10;
            sum= (sum*10) + r;
            x = x / 10;
        }

            if(temp == sum) return true;
            else
            return false;
        

        }
}