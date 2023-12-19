import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameYearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            nameYearningMap.put(name[i], yearning[i]); // name을 키로, yearning 값을 값으로 저장
        }
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            for (String photoName : photo[i]) {
                answer[i] += nameYearningMap.getOrDefault(photoName, 0); // photoName이 해시맵에 있으면 해당 값을, 없으면 0을 더함
            }
        }

        return answer;
    }
}