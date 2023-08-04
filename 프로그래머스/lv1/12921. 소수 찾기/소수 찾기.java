class Solution {
    public int solution(int n) {
        boolean[] primeArray = new boolean[n + 1]; 
        int answer = 0;

        int root = (int) Math.sqrt(n);

        for (int i = 2; i <= root; i++) { 
            if (!primeArray[i]) { 
                for (int j = i * i; j <= n; j += i) { 
                    primeArray[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) { 
            if (!primeArray[i]) 
                answer++;
        }

        return answer;
    }
}
