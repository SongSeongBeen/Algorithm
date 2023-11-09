class Solution {
    public int[][] solution(int[][] arr) {
        int intRows = arr.length;    // 행의 개수
        int intCols = arr[0].length; // 열의 개수
        int intMaxSide = Math.max(intRows, intCols); // 가장 긴 변의 길이
        int[][] answer = new int[intMaxSide][intMaxSide]; // 새로운 정사각형 배열 생성

        for (int i = 0; i < intRows; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, intCols);
        }
        // 나머지 부분은 int 배열 초기화 시 0으로 이미 설정됨

        return answer;
    }
}
