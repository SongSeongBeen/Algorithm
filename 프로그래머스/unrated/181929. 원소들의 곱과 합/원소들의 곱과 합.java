class Solution {
    public int solution(int[] num_list) {
        int sum = 0, mltplSum = 1;
        for(int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            mltplSum *= num_list[i];
        }
        return  mltplSum > sum*sum  ? 0 : 1;
    }
}