import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> tempList = new ArrayList<>();

        switch (n) {
            case 1 -> tempList = IntStream.rangeClosed(0, slicer[1]).mapToObj(i -> num_list[i]).collect(Collectors.toList());
            case 2 -> tempList = IntStream.rangeClosed(slicer[0], num_list.length - 1).mapToObj(i -> num_list[i]).collect(Collectors.toList());
            case 3 -> tempList = IntStream.rangeClosed(slicer[0], slicer[1]).mapToObj(i -> num_list[i]).collect(Collectors.toList());
            case 4 -> {
                for(int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
                    tempList.add(num_list[i]);
                }
            }
            default -> throw new IllegalArgumentException("뭐야뭐야");
        }

        return tempList.stream().mapToInt(i -> i).toArray();
    }
}
