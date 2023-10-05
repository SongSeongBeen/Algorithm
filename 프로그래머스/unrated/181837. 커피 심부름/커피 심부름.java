import java.util.Map;
import java.util.HashMap;

class Solution {

    private static final Map<String, Integer> MapPrice;

    static {
        MapPrice = new HashMap<>();
        MapPrice.put("iceamericano", 4500);
        MapPrice.put("americanoice", 4500);
        MapPrice.put("hotamericano", 4500);
        MapPrice.put("americanohot", 4500);
        MapPrice.put("americano", 4500);
        MapPrice.put("anything", 4500);
        MapPrice.put("icecafelatte", 5000);
        MapPrice.put("cafelatteice", 5000);
        MapPrice.put("hotcafelatte", 5000);
        MapPrice.put("cafelattehot", 5000);
        MapPrice.put("cafelatte", 5000);
    }

    public int solution(String[] order) {
        int answer = 0;
        for (String strOrder : order) {
            answer += MapPrice.getOrDefault(strOrder, 0);
        }
        return answer;
    }
}
