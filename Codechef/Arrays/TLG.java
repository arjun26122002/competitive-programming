import java.util.*;
import java.lang.*;
import java.io.*;

public class TLG {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] pl1 = new int[n];
        int[] pl2 = new int[n];
        int samepl1[] = new int[n];
        int samepl2[] = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            pl1[i] = sc.nextInt();
            pl2[i] = sc.nextInt();
            samepl1[0] = pl1[0];
            samepl2[0] = pl2[0];
        }

        for (int i = 1; i < n; i++) {
            samepl1[i] = pl1[i] + samepl1[i - 1];
            samepl2[i] = pl2[i] + samepl2[i - 1];

        }
        for (int i = 0; i < n; i++) {
            result[i] = Math.abs(samepl1[i] - samepl2[i]);
        }
        int a=result[0];
        int index=0;
        for(int i=1;i<n;i++){
            if(a<result[i]){
                index=i;
                a=result[i];
            }
        }
      if(samepl1[index]> samepl2[index] ){
        System.out.println("1 " + a);
      }
      else
      System.out.println("2 " + a);

    }
}
