import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> resultList = new ArrayList<>();

        for (String str : intStrs) {
            if (s + l <= str.length()) { 
                int value = 0;
                boolean validNumber = true;

                for (int i = s; i < s + l; i++) {
                    char c = str.charAt(i);
                    if (Character.isDigit(c)) {
                        value = value * 10 + (c - '0');
                    } else {
                        validNumber = false;
                        break;
                    }
                }

                if (validNumber && value > k) {
                    resultList.add(value);
                }
            }
        }

        // 리스트를 배열로 변환
        return resultList.stream().mapToInt(i -> i).toArray();
    }
}