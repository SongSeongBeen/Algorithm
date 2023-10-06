import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int[] stk = new int[arr.length];
        int idx = 0; 

        for (int i = 0; i < arr.length; i++) {
            while (idx > 0 && stk[idx - 1] >= arr[i]) {
                idx--; 
            }
            stk[idx++] = arr[i]; 
        }

        return Arrays.copyOf(stk, idx); 
    }
}