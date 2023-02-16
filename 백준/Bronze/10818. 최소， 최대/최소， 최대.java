import java.util.*;

class Main{
    	public static void main(String[] args) {
		     
			Scanner s = new Scanner(System.in); 		
			int a = s.nextInt();			
			int N[] = new int[a];
			for(int i =0; i<N.length; i++) {
				N[i] = s.nextInt();				
			}
			
			Arrays.sort(N);
			System.out.println(N[0]+" "+N[a-1]);
	} 
}