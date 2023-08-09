class Solution {
    public int solution(String binomial) {
        String[] strArrPart = binomial.split(" ");
        
        int operand1 = Integer.parseInt(strArrPart[0]);
        int operand2 = Integer.parseInt(strArrPart[2]);

        return switch(strArrPart[1]){
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            default -> throw new IllegalArgumentException(strArrPart[1] + "은 지원하지 않는 연산자입니다.");
        };
    }
}