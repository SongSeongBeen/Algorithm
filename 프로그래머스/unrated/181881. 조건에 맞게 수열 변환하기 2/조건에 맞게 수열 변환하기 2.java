class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while(true) {
            boolean isAllSame = true;

            for(int i = 0; i < arr.length; i++) {
                int prevValue = arr[i];
                if(prevValue >= 50 && prevValue % 2 == 0) {
                    arr[i] /= 2;
                } else if(prevValue < 50 && prevValue % 2 == 1) {
                    arr[i] = prevValue * 2 + 1;
                }

                if(prevValue != arr[i]) {
                    isAllSame = false;
                }
            }

            if(isAllSame) {
                break;
            }
            
            answer++;
        }
        
        return answer;
    }
}
