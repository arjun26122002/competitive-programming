class Solution {
    public boolean checkIfPangram(String str) {
        boolean flag = false;
        for( char ch = 'a' ; ch <= 'z' ; ch ++){
            boolean pangram = check_pangram(ch , str);
            if ( pangram == false ){
                flag = false ;
                break;
            }
            else {
                flag = true ;
            }
        }

        return flag ;
    }


        public boolean check_pangram(char ch , String str ){
            for ( char c : str.toCharArray()){
                if ( c == ch )
                    return true ;

            }
                

                return false;
    }
        
}
