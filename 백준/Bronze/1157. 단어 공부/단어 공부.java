import java.util.*;

class Main {

    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (char chr : str.toUpperCase().toCharArray()) {
            if ('A' <= chr && chr <= 'Z') {
                count[chr - 'A']++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = getAlphabetCount(str);

        int maxCount = -1;
        char maxAlphabet = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxAlphabet = (char) ('A' + i);
            } else if (count[i] == maxCount) {
                maxAlphabet = '?';
            }
        }
        
        System.out.println(maxAlphabet);
    }
}
