import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        List<Integer> posList = new ArrayList<Integer>();
        List<Integer> negList = new ArrayList<Integer>();
        for (String num : sArr) {
            int n = Integer.parseInt(num);
            if (n < 0) {
                negList.add(n);
            } else {
                posList.add(n);
            }
        }
        Collections.sort(negList);
        Collections.sort(posList);
        String[] sortedArr = new String[sArr.length];
        int i = 0;
        for (int num : negList) {
            sortedArr[i++] = Integer.toString(num);
        }
        for (int num : posList) {
            sortedArr[i++] = Integer.toString(num);
        }
        answer = sortedArr[0] + " " + sortedArr[sortedArr.length-1];
        return answer;
    }
}