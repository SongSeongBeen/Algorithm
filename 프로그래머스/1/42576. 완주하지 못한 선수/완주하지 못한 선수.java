import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 참가자 명단에 각 참가자의 등장 횟수를 저장
        for (String player : participant) {
            hashMap.put(player, hashMap.getOrDefault(player, 0) + 1);
        }

        // 완성된 명단의 참가자를 제거하며 동시에 누락된 참가자를 찾기
        for (String player : completion) {
            hashMap.put(player, hashMap.get(player) - 1);
            if (hashMap.get(player) == 0) {
                hashMap.remove(player);
            }
        }

        // 누락된 참가자 반환
        return hashMap.keySet().iterator().next();
    }
}
