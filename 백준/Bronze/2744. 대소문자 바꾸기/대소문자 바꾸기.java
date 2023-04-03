import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(int i =0; i<str.length(); i++){
           char ch = str.charAt(i);
           System.out.print('A' <= ch && ch <= 'Z' ? (char)('a'+ ch - 'A') : (char)('A'+ ch - 'a')); 
        }
        
    }
}