import java.util.*;
public class Main{
    public static void main(String[] args){
        for(int n = new Scanner(System.in).nextInt(), i=0; i<2*n-1; i++) 
            System.out.println(" ".repeat(Math.abs(n-1-i)) + "*".repeat((2*n-1)-2*Math.abs(n-1-i)));
    }
}