class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            String binary1 = Integer.toBinaryString(arr1[i]);
            String binary2 = Integer.toBinaryString(arr2[i]);

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j < binary1.length() && binary1.charAt(binary1.length() - 1 - j) == '1') {
                    sb.append("#");
                } else if (j < binary2.length() && binary2.charAt(binary2.length() - 1 - j) == '1') {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }

            answer[i] = sb.reverse().toString();
        }

        return answer;
    }
}