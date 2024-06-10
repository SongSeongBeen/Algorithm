import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> friendIndices = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            friendIndices.put(friends[i], i);
        }

        int[] netGifts = new int[friends.length];
        int[][] transactions = new int[friends.length][friends.length];

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giverIndex = friendIndices.get(parts[0]);
            int receiverIndex = friendIndices.get(parts[1]);

            netGifts[giverIndex]++;
            netGifts[receiverIndex]--;
            transactions[giverIndex][receiverIndex]++;
        }

        int maxInfluence = 0;
        for (int i = 0; i < friends.length; i++) {
            int influence = 0;
            for (int j = 0; j < friends.length; j++) {
                if (i == j) continue; 

                if (transactions[i][j] > transactions[j][i] ||
                    (transactions[i][j] == transactions[j][i] && netGifts[i] > netGifts[j])) {
                    influence++;
                }
            }
            maxInfluence = Math.max(maxInfluence, influence);
        }

        return maxInfluence;
    }
}