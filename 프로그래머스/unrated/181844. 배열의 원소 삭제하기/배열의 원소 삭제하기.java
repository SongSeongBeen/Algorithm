import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
     
        // arr 배열을 리스트로 변환
        List<Integer> list = new ArrayList<Integer>();
        for(int i: arr) {
            list.add(i);
        }
        
        // delete_list의 원소를 리스트에서 삭제
        for(int i: delete_list) {
            while(list.contains(i)) {
                list.remove(Integer.valueOf(i));
            }
        }

        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}