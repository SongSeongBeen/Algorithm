import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        String strA = sc.next();
        String strB = sc.next();
        
        int[] intCountArr = new int[26];

        for (int i = 0; i < strA.length(); i++) {
            intCountArr[strA.charAt(i) - 'a']++;  // strA 문자 빈도 증가
        }

        for (int i = 0; i < strB.length(); i++) {
            intCountArr[strB.charAt(i) - 'a']--;  // strB 문자 빈도 감소
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(intCountArr[i]);
        }

        System.out.println(ans);
    }
}
