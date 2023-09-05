import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder();
        for(char chr : str.toCharArray()){
            if(Character.isUpperCase(chr)){
                sb.append(Character.toLowerCase(chr));
            }
            else if(Character.isLowerCase(chr)){
                sb.append(Character.toUpperCase(chr));
            }
        }
        System.out.print(sb.toString());
    }
}
