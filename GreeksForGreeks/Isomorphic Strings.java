import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class isomorphic {
    public static boolean isIsomorphic(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        } else {

            Map<Character, Character> hmap = new HashMap();

            for (int i = 0; i < str1.length(); i++) {

                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);

                if (hmap.containsKey(ch1)) {
                    if (hmap.get(ch1) != (ch2))
                        return false;

                } else {
                    hmap.put(ch1, ch2);
                }

            }

        }

        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        String str1 = sc.nextLine();
        System.out.println("Enter second number: ");
        String str2 = sc.nextLine();

        boolean resultFlag = isIsomorphic(str1, str2);

        if (resultFlag)
            System.out.println("Both are isomophic");
        else
            System.out.println("Both are not  isomophic");

    }
}