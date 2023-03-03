import java.util.*;
public class Main{
    public static void main(String[] args){
        String A =  new Scanner(System.in).next();
        String reA = new StringBuffer(A).reverse().toString();
        System.out.print(A.equals(reA) ? 1 : 0);                      
    }
}