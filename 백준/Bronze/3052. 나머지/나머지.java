import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> remainders = new HashSet<Integer>(); // 중복되지 않는 값 저장을 위한 Set

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int remainder = num % 42; // 42로 나눈 나머지 구하기
            remainders.add(remainder); // Set에 나머지 값 추가
        }

        System.out.println(remainders.size()); // Set의 크기 출력
    }
}
