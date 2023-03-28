import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;

    	 String sortBefore = Stream.of(before.split("")).sorted().collect(Collectors.joining());
    String sortAfter = Stream.of(after.split("")).sorted().collect(Collectors.joining());;
    	  
        return sortBefore.equals(sortAfter) ? 1 : 0;
    }
}