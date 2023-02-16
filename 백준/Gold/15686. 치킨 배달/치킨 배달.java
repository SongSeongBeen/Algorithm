import java.util.*;

public class Main {
    static int n, m;
    static int[][] map;
    static ArrayList<Point> chickens;
    static ArrayList<Point> homes;
    static int minDist = Integer.MAX_VALUE;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        map = new int[n+1][n+1];
        chickens = new ArrayList<>();
        homes = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                map[i][j] = sc.nextInt();
                if (map[i][j] == 1) {
                    homes.add(new Point(i, j));
                } else if (map[i][j] == 2) {
                    chickens.add(new Point(i, j));
                }
            }
        }
        
        ArrayList<Integer> selected = new ArrayList<>();
        selectChickens(0, 0, selected);
        System.out.println(minDist);
    }
    
    // 치킨집 중에서 M개를 선택하는 모든 경우를 구하는 함수
    static void selectChickens(int index, int cnt, ArrayList<Integer> selected) {
        if (cnt == m) {
            minDist = Math.min(minDist, getChickenDistance(selected));
            return;
        }
        if (index == chickens.size()) {
            return;
        }
        selected.add(index);
        selectChickens(index+1, cnt+1, selected);
        selected.remove(selected.size()-1);
        selectChickens(index+1, cnt, selected);
    }
    
    // 선택된 치킨집들로부터 도시의 치킨 거리를 계산하는 함수
    static int getChickenDistance(ArrayList<Integer> selected) {
        int totalDist = 0;
        for (Point home : homes) {
            int dist = Integer.MAX_VALUE;
            for (int i : selected) {
                Point chicken = chickens.get(i);
                int d = Math.abs(home.x - chicken.x) + Math.abs(home.y - chicken.y);
                dist = Math.min(dist, d);
            }
            totalDist += dist;
        }
        return totalDist;
    }
    
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}