class Solution {
    public int solution(String binomial) {
        String[] strArrBin = binomial.split(" ");
        
        int operand1 = Integer.parseInt(strArrBin[0]);
        int operand2 = Integer.parseInt(strArrBin[2]);

        switch(strArrBin[1]){
            case "+" : 
                return operand1 + operand2;
            case "-" : 
                return operand1 - operand2;
            case "*" : 
                return operand1 * operand2;
            default:
                throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
        }
    }
}
