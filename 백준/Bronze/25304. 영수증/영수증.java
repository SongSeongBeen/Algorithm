import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        for(int i = 0; i<b; i++){
            a -=(s.nextInt()*s.nextInt());
        }
        System.out.print(a==0?"Yes":"No");
    }
    
}