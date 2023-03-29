class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        answer = Integer.toBinaryString(intBinaryNumber(bin1) + intBinaryNumber(bin2));
        return answer;
    }
    //2진수 변환 
    private int intBinaryNumber(String bin){
        return Integer.parseInt(bin, 2);
    }
    
}