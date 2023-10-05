class Solution {
    public String solution(int q, int r, String code) {
       // 최대로 필요한 문자의 개수를 계산하여 StringBuilder의 초기 크기를 설정
       int initialCapacity = (code.length() - r + q - 1) / q;
       StringBuilder answer = new StringBuilder(initialCapacity);
       
       for (int i = r; i < code.length(); i += q) {
           answer.append(code.charAt(i));
       }
        
        return answer.toString();
    }
}
