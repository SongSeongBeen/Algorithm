class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        for (String s : keyinput) {
            answer[0] += (s.equals("right") && answer[0] < board[0] / 2) ? 1 :
                         (s.equals("left") && answer[0] > -board[0] / 2) ? -1 : 0;
            answer[1] += (s.equals("up") && answer[1] < board[1] / 2) ? 1 :
                         (s.equals("down") && answer[1] > -board[1] / 2) ? -1 : 0;
        }
    return answer;
    }

}