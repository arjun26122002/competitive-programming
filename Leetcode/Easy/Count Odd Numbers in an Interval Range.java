class Solution {
    public int countOdds(int low, int high) {
        int res = high - low ;
        if(low % 2 != 0 || high % 2 != 0) return res/2 + 1;
        else return res / 2 ;
    }
}