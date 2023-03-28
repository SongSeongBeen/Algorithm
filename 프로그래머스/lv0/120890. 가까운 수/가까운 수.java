import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int index = findClosestIndex(array, n);
        return getClosestValue(array, n, index);
    }

    private int findClosestIndex(int[] array, int n) {
        int index = 0;
        while (index < array.length && array[index] < n) {
            index++;
        }
        return index;
    }

    private int getClosestValue(int[] array, int n, int index) {
        if (index == 0 || index == array.length) {
            return array[Math.max(index - 1, 0)];
        }
        return n - array[index - 1] <= array[index] - n ? array[index - 1] : array[index];
    }
}