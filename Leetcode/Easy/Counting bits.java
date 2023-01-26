class Solution {
    public int[] countBits(int num) {
        int [] ans = new int[ num + 1 ];

        for(int i = 0; i <= num ; i++){
            ans[i] = ad (i) ;
        }

        return ans;
    }

    private static int ad(int num){
        if(num == 0)  return 0;
        if(num == 1)  return 1;


        if(num%2 == 0)  return ad(num/2);
        else            return 1+ad(num/2);

    }
}