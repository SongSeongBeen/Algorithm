class Solution {
    public int[] solution(int[] arr) {
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i; // 마지막에 2가 발견된 위치
            }
        }

        if (firstIndex == -1) {
            return new int[]{-1};
        } else if (firstIndex == lastIndex) {
            return new int[]{2};
        } else {
            int[] answer = new int[lastIndex - firstIndex + 1];
            System.arraycopy(arr, firstIndex, answer, 0, lastIndex - firstIndex + 1);
            return answer;
        }
    }
}
