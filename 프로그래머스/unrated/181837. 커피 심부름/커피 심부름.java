class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String item : order) {
            answer += switch (item) {
                case "iceamericano", "americanoice", "hotamericano", "americanohot", "americano", "anything" -> 4500;
                case "icecafelatte", "cafelatteice", "hotcafelatte", "cafelattehot", "cafelatte" -> 5000;
                default -> 0;
            };
        }
        return answer;
    }
}