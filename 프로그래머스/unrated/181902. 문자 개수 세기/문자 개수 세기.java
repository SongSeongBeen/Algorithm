class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(char chr : my_string.toCharArray()) {
            if(Character.isUpperCase(chr)) {
                answer[chr - 'A']++;
            } else if(Character.isLowerCase(chr)) {
                answer[chr - 'a' + 26]++;
            }
        }
        
        return answer;
    }
}
