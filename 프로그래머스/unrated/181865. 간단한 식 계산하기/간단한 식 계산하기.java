class Solution {
    public int solution(String binomial) {
        String[] strArrBin = binomial.split(" ");
        
        int operand1 = Integer.parseInt(strArrBin[0]);
        int operand2 = Integer.parseInt(strArrBin[2]);

        return switch(strArrBin[1]){
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            default -> throw new IllegalArgumentException(strArrBin[1] + "은 지원하지 않는 연산자입니다.");
        };
    }
}