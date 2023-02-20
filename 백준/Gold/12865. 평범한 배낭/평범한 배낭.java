import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 물건
        int K = sc.nextInt(); // 배낭
        int[] weights = new int[N];
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
            values[i] = sc.nextInt();
        }
        sc.close();
        int[][] dp = new int[N+1][K+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (j >= weights[i-1]) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weights[i-1]] + values[i-1]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}