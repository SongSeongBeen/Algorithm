import java.util.Scanner;


public class Main {
public static void main(String[] args)  {
		
		int s = new Scanner(System.in).nextInt();
		int sum = 0;
		for(int i =0; i<=s; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}