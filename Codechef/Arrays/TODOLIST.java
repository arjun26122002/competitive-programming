import java.util.*;
import java.lang.*;
import java.io.*;

public class TODOLIST {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int c = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] >= 1000) {
                    c++;
                }
            }
            System.out.println(c);
        }

    }
}
