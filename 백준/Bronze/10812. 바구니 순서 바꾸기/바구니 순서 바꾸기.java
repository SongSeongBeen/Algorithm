import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = a + 1;
		}

		for (int a = 0; a < m; a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();

			int count = j - k + 1;
			while (count > 0) {
				count--;
				int temp = arr[j - 1];
				for (int b = j - 1; b >= i; b--) { 

					arr[b] = arr[b - 1];
				}
				arr[i - 1] = temp;
			}

		}
		for (int c = 0; c < n; c++) {
			System.out.print(arr[c] + " ");
		}

	}

}