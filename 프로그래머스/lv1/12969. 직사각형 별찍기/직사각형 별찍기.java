import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
 
        for(int i = 0; i<b; i++){
            System.out.print("*".repeat(a)+System.lineSeparator());
        }
    }
}