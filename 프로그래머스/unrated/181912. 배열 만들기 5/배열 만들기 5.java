import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> resultList = new ArrayList<>();

        for (String str : intStrs) {
            if (s + l <= str.length()) { // 서브스트링 추출이 가능한지 검사
                try {
                    String sub = str.substring(s, s + l);
                    int value = Integer.parseInt(sub);
                    if (value > k) {
                        resultList.add(value);
                    }
                } catch (NumberFormatException e) {
                    // 변환 불가능한 서브스트링은 무시
                }
            }
        }

        // 리스트를 배열로 변환
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}