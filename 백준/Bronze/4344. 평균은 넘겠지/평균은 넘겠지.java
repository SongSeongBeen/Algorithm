import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스 개수

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // 학생 수
            int[] scores = new int[n]; // 학생들의 점수 배열
            int sum = 0;

            // 학생들의 점수 입력받기
            for (int j = 0; j < n; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }

            double average = (double) sum / n; // 평균 계산
            int aboveAverageCount = 0;

            // 평균 이상인 학생들의 수 세기
            for (int j = 0; j < n; j++) {
                if (scores[j] > average) {
                    aboveAverageCount++;
                }
            }

            double aboveAverageRatio = (double) aboveAverageCount / n * 100; // 비율 계산
            System.out.printf("%.3f%%\n", aboveAverageRatio); // 소수점 셋째 자리까지 출력
        }
    }
}