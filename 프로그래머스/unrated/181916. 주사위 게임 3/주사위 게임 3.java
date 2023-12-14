import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        frequencyMap.put(a, frequencyMap.getOrDefault(a, 0) + 1);
        frequencyMap.put(b, frequencyMap.getOrDefault(b, 0) + 1);
        frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        frequencyMap.put(d, frequencyMap.getOrDefault(d, 0) + 1);

        // 모든 숫자가 같은 경우
        if (frequencyMap.size() == 1) {
            return a * 1111;
        }

        // 두 가지 숫자만 있는 경우
        if (frequencyMap.size() == 2) {
            if (frequencyMap.containsValue(3)) {
                for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                    answer += entry.getKey() * (entry.getValue() == 3 ? 10 : 1);
                }
                return answer * answer;
            }
            // 두 숫자가 각각 두 번씩 등장하는 경우
            int diffNum = (a + b + c + d - 2 * a) / 2; // 다른 숫자 찾기
            return (a + diffNum) * Math.abs(a - diffNum);
        }

        // 세 가지 숫자가 있는 경우
        if (frequencyMap.size() == 3) {
            answer = 1;
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                if (entry.getValue() != 2) {
                    answer *= entry.getKey();
                }
            }
            return answer;
        }

        // 모든 숫자가 다른 경우
        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}
