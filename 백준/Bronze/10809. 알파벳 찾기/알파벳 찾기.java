import java.util.Scanner;

class Main{
   	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
						
		String str = sc.nextLine();
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(arr[ch - 97] == -1) arr[ch - 97] =i;			
		}
		
		for(int answer : arr) {
			System.out.print(answer + " ");
		}		
	}
}