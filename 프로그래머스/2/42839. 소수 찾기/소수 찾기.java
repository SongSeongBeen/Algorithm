import java.util.HashSet;

class Solution {
    HashSet<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {
        permutation(new StringBuilder(), numbers);
        return numberSet.size();
    }
    
    private void permutation(StringBuilder prefix, String str) {
        int n = str.length();
        if (prefix.length() != 0) {
            int num = Integer.parseInt(prefix.toString());
            if (isPrime(num)) {
                numberSet.add(num);
            }
        }
        for (int i = 0; i < n; i++) {
            prefix.append(str.charAt(i));
            permutation(prefix, str.substring(0, i) + str.substring(i+1, n));
            prefix.deleteCharAt(prefix.length() - 1); // 마지막 문자 제거
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}