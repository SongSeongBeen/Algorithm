class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start, end, step;

        switch (n) {
            case 1 -> {
                start = 0;
                end = slicer[1];
                step = 1;
            }
            case 2 -> {
                start = slicer[0];
                end = num_list.length - 1;
                step = 1;
            }
            case 3 -> {
                start = slicer[0];
                end = slicer[1];
                step = 1;
            }
            case 4 -> {
                start = slicer[0];
                end = slicer[1];
                step = slicer[2];
            }
            default -> throw new IllegalArgumentException("모야모야");
        }
        
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }

        return answer;
    }
}