class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean mode = false;

        for(int i = 0; i < code.length(); i++) {
            // mode 변경
            if(code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            // mode에 따른 문자 추가
            if((mode && i % 2 != 0) || (!mode && i % 2 == 0)) {
                answer.append(code.charAt(i));
            } 
        }
        return (answer.length() == 0) ? "EMPTY" : answer.toString();
    }
}