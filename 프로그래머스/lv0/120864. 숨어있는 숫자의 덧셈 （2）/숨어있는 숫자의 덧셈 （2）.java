import java.util.*;

class Solution {
    public int solution(String my_string) {
        return Arrays.stream(my_string.split("[^0-9]+")).filter(num -> !num.equals("")).mapToInt(Integer::parseInt).sum();
    }
}