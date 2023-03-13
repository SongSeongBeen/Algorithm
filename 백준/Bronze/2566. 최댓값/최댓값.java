import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[] args) throws IOException{
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int arry[][] = new int[9][9];
      for(int i=0; i< 9; i++) {
    	  String[] sArr = br.readLine().split(" ");
    	  for(int j=0; j<9; j++) {
    			  arry[i][j] += Integer.parseInt(sArr[j]);
    	  }
      }      
      int n = 0;
      int r = 0;
      int c = 0;
      for(int i = 0; i<9; i++) {
    	  for(int j=0; j<9; j++) {
    		  if(n < arry[i][j]) {
    			  n = arry[i][j];
    			  r = i;
    			  c = j;
    		  }
    	  }
      }
      System.out.println(n);
	  System.out.println((r+1) + " " + (c+1));    
    }
}