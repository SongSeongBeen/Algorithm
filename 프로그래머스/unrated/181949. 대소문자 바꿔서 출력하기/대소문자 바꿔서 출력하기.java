import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String str = "";
         for(Character chr : a.toCharArray()){
            str += (Character.isLowerCase(chr)) ? Character.toUpperCase(chr) : Character.toLowerCase(chr);        
        }
        System.out.println(str);
    }
}