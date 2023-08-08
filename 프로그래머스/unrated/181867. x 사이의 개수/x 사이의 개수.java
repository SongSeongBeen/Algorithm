class Solution {
    public int[] solution(String myString) {
        String[] arrStr = myString.split("x", -99999);
        int[] answer = new int[arrStr.length];
        
        int i = 0;
        for (String s : arrStr) {
            answer[i++] = s.length();
        }

        return answer;
    }
}