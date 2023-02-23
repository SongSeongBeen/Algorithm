import java.util.*;
class Main{
public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
		
		for(int i=sc.nextInt();i>0;i--) {
			int n=sc.nextInt();
			String a=sc.next();
			for(char ch:a.toCharArray()){
			    System.out.print((ch+"").repeat(n));
            }
            System.out.println();             
		}
    }
}