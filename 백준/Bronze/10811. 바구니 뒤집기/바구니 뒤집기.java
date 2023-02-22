import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	    StringTokenizer st = new StringTokenizer(br.readLine());
	
	    int[] arr = new int[Integer.parseInt(st.nextToken())];
	    for(int i=0; i<arr.length; i++) {
	    	arr[i] = i+1;
	    }
	    
	    int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st.nextToken())-1;
            int J = Integer.parseInt(st.nextToken())-1;
            	
            while(I<J) {
            	int temp = arr[I];
            	arr[I++] = arr[J];
            	arr[J--] = temp;
            }
            
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}