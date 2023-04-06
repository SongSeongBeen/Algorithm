class Solution {
    public int solution(int[][] dots) {
        int x1 = dots[3][0];
        int y1 = dots[3][1];
        for (int i = 0; i < 3; i++) {
            int x2 = dots[i][0];
            int y2 = dots[i][1];
            int x3 = dots[(i+1)%3][0];
            int y3 = dots[(i+1)%3][1];
            int x4 = dots[(i+2)%3][0];
            int y4 = dots[(i+2)%3][1];
            if (isParallel(x1, y1, x2, y2, x3, y3, x4, y4)) {
                return 1;
            }
        }
        return 0;
    }
    
    private boolean isParallel(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        double slope1 = (double)(y2 - y1) / (x2 - x1);
        double slope2 = (double)(y4 - y3) / (x4 - x3);
        return slope1 == slope2;
    }
}