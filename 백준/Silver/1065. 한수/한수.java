import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (isHansu(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static boolean isHansu(int x) {
        if (x < 100) {
            return true;
        }

        int d = x / 10 % 10 - x % 10;
        x /= 10;
        while (x >= 10) {
            if (d != x / 10 % 10 - x % 10) {
                return false;
            }
            x /= 10;
        }
        return true;
    }
}



