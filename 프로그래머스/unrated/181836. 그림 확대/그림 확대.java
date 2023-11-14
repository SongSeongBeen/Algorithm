class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];

        for (int i = 0; i < picture.length; i++) {
            String scaledRow = scaleRow(picture[i], k);
            for (int j = 0; j < k; j++) {
                answer[i * k + j] = scaledRow;
            }
        }

        return answer;
    }
    
    // 문자열의 각 문자를 k번 반복하여 가로로 확대
    private static String scaleRow(String row, int k) {
        StringBuilder scaledRow = new StringBuilder(row.length() * k);
        for (char pixel : row.toCharArray()) {
            scaledRow.append(String.valueOf(pixel).repeat(k));
        }
        return scaledRow.toString();
    }
}