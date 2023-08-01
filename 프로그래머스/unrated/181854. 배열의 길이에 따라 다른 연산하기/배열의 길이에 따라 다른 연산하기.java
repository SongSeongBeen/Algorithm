class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr.clone();
        
        int start = arr.length % 2 == 0 ? 1 : 0;
        
        for(int index = start; index < arr.length; index +=2){
            answer[index] = arr[index]+n;    
        }
        return answer;
    }
}