import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] food) {
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < food.length; i++) {
            int half = food[i] / 2;
            
            String repeated = String.valueOf(i).repeat(half);

            num.append(repeated);

        }

        return num.toString() + "0" + num.reverse().toString();
    }
}
