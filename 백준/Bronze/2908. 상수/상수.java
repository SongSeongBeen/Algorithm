import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int aRev = 0, bRev = 0;
        while(a!=0||b!=0){
            aRev = aRev*10 + a%10;
            a/=10;
            bRev = bRev*10 + b%10;
            b/=10;
        }
        System.out.print(aRev > bRev ? aRev :bRev);
    }
}