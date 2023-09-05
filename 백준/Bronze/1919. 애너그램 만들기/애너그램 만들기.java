import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strA = sc.next();
        String strB = sc.next();
        
        int[] intCountArr = new int[26];

        for (int i = 0; i < Math.max(strA.length(), strB.length()); i++) {
            if (i < strA.length()) {
                intCountArr[strA.charAt(i) - 'a']++;
            }
            if (i < strB.length()) {
                intCountArr[strB.charAt(i) - 'a']--;
            }
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(intCountArr[i]);
        }

        System.out.println(ans);
    }
}
