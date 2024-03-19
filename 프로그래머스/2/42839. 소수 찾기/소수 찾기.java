import java.util.HashSet;

class Solution {
    HashSet<Integer> numberSet = new HashSet<>();
    
    public int solution(String numbers) {
        permutation("", numbers);
        return numberSet.size();
    }
    
    private void permutation(String prefix, String str) {
        int n = str.length();
        if (!prefix.equals("")) {
            int num = Integer.parseInt(prefix);
            if (isPrime(num)) {
                numberSet.add(num);
            }
        }
        for (int i = 0; i < n; i++) {
            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
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