import java.util.*;
import java.util.stream.*;

class Solution {
    public String[] solution(String myString) {
        return Arrays.stream(myString.trim().split("x"))
                     .filter(s -> !s.isEmpty())
                     .sorted()
                     .toArray(String[]::new);
    }
}
