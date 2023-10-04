class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i = 0; i < queries.length; i++) {
            int start = (queries[i][0] + queries[i][2] - 1) / queries[i][2] * queries[i][2];
            for(int j = start; j <= queries[i][1]; j += queries[i][2]) {
                arr[j]++;
            }
        }
        return arr;
    }
}
