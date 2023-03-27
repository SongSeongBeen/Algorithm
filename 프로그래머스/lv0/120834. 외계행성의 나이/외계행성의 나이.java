import java.util.*;

class Solution {
    public String solution(int age) {
        return Integer.toString(age).chars().map(c -> c + 49).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
    }
}