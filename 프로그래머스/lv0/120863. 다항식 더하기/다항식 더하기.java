class Solution {
    public String solution(String polynomial) {
        String answer ="";
        String[] arr = polynomial.split(" +");
        int strNum = 0, num = 0;

        for (String s : arr) {
            if (s.equals("x")) strNum += 1;
            else if (s.contains("x")) strNum += Integer.parseInt(s.substring(0, s.length() - 1));
            else if (!s.equals("+")) num += Integer.parseInt(s);
        }

        if (strNum != 0 && num == 0) answer = (strNum == 1) ? "x" : (strNum + "x");
        else if (strNum != 0 && num != 0) answer = (strNum == 1) ? ("x + " + num) : (strNum + "x + " + num);
        else if (strNum == 0 && num != 0) answer = String.valueOf(num);

        return answer;
    }
}