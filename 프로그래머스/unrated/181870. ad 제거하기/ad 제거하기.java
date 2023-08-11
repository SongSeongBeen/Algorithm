import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> resultList = new ArrayList<>();
        
        for (String s : strArr) {
            if (!s.contains("ad")) {
                resultList.add(s);
            }
        }
        
        return resultList.toArray(new String[0]);
    }
}
