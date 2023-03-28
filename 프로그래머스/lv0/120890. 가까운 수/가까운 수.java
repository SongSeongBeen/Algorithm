import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int index = findClosestIndex(array, n);
        return getClosestValue(array, n, index);
    }

    private int findClosestIndex(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= n) {
                return i;
            }
        }
        return array.length - 1;
    }

    private int getClosestValue(int[] array, int n, int index) {
        if (index == 0) {
            return array[index];
        }
        
        if (index == array.length) {
            return array[array.length - 1];
        }
        
        return n - array[index - 1] <= array[index] - n ? array[index - 1] : array[index];
    }
}
