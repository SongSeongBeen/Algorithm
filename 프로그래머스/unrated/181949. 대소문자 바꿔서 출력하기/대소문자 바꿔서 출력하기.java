import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
        for(int i = 0; i < a.length(); i++){
            char chr = a.charAt(i);
            str += (Character.isLowerCase(chr)) ? Character.toUpperCase(chr) : Character.toLowerCase(chr);        
        }
        System.out.println(str);
    }
}