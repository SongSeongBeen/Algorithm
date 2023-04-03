import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nArr = new int [N];
        for(int i =0; i<nArr.length; i++){
            nArr[i] = sc.nextInt();
        }
        Arrays.sort(nArr);
        double sum = 0;
        for(int i=0; i<nArr.length; i++){
            sum +=nArr[i];
        }
        System.out.println(sum*100/nArr[nArr.length-1]/N);
    }
}