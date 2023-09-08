import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {        
        String[] answer = myStr.split("a|b|c");
        ArrayList<String> list = new ArrayList<>();

        for (String s : answer) {
            if (!s.isEmpty()) {
                list.add(s);
            }
        }

        return (list.size() == 0) ? new String[] {"EMPTY"} : list.toArray(new String[0]);
    }
}
