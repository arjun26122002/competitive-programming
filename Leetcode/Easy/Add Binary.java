class Solution {
    public String addBinary(String a, String b) {
        // int num1 = Integer.parseInt(a,2);
        // int num2 = Integer.parseInt(b,2);

        // int ans = num1 + num2 ;

        // return Integer.toBinaryString(ans);

        StringBuilder ad = new StringBuilder();

        int i = a.length() - 1 ;
        int j = b.length() - 1;

        int carry = 0 ;

        while(i >= 0 || j >= 0)
        {
            int sum = carry ;
            if( i >= 0) sum += a.charAt(i) - '0';
            if( j >= 0) sum += b.charAt(j) - '0';
            ad.append(sum % 2);
            carry = sum / 2 ;

            i--;
            j--;


        }

        if(carry != 0) ad.append(carry);
        return ad.reverse().toString();
       
        
    }
}