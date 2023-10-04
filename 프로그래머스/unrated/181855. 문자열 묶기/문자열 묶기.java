import java.util.*;

public class Solution {

    public static int solution(String[] strArr) {
        Map<Integer, Integer> answer = new HashMap<>();

        for (String str : strArr) {
            int length = str.length();
            answer.put(length, answer.getOrDefault(length, 0) + 1);
        }

        return Collections.max(answer.values());
    }
}