import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isValid(i)) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        return list.stream().mapToInt(i -> i).toArray();
    }

    private boolean isValid(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
