import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);     
		int n[] = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i =0; i<9; i++) {
			int a = s.nextInt();
			n[i] = a;
		}
		for(int i =0; i<9; i++) {
			if(n[i]>max) {
				max = n[i];
				index = i+1;
			}
		}		
		System.out.println(max);
		System.out.println(index);
    }
}