import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reA = new StringBuffer(A).reverse().toString();
        System.out.print(A.equals(reA) ? 1 : 0);                      
    }
}