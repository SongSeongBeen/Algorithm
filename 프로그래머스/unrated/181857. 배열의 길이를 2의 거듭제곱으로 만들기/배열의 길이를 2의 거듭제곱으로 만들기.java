class Solution {
    public int[] solution(int[] arr) {
    int len = arr.length;
    
    if((len & (len - 1)) == 0) {
        return arr;
    }

    int newSize = 1;
    while(newSize < len) {
        newSize <<= 1;
    }
        
    int[] answer = new int[newSize];
    for(int i = 0; i < len; i++) {
        answer[i] = arr[i];
    }
    return answer;
    }
}