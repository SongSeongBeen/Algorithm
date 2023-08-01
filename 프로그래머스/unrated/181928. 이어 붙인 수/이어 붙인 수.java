class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuilder evenSum = new StringBuilder(), oddSum = new StringBuilder();
        for(int n : num_list){
            if(n%2==0){
                 evenSum.append(n);
            } else {
                oddSum.append(n);
            }
        }
        return Integer.parseInt(evenSum.toString()) + Integer.parseInt(oddSum.toString());
    }
}