class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        boolean[][] landmine = new boolean[board.length][board.length];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == 1) {
                    destroy(col, row, landmine);
                }
            }
        }
        answer = countSafeCells(landmine);
        return answer;
    }

    private static void destroy(int col, int row, boolean[][] landmine) {
        for (int r = Math.max(0, row - 1); r <= Math.min(landmine.length - 1, row + 1); r++) {
            for (int c = Math.max(0, col - 1); c <= Math.min(landmine.length - 1, col + 1); c++) {
                landmine[r][c] = true;
            }
        }
    }

    private static int countSafeCells(boolean[][] landmine) {
        int count = 0;
        for (boolean[] row : landmine) {
            for (boolean cell : row) {
                if (!cell) {
                    count++;
                }
            }
        }
        return count;
    }
}