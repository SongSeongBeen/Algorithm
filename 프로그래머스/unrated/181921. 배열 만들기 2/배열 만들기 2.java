import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = 0;
            int temp = i;
            int base = 1;

            while (temp > 0) {
                if ((temp & 1) == 1) {
                    num += 5 * base;
                }
                temp >>= 1;
                base *= 10;
            }

            if (l <= num && num <= r) {
                list.add(num);
            }
        }

        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
}
