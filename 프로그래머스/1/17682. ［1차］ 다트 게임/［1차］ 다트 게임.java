class Solution {
    public int solution(String dartResult) {
        int[] score = new int[3];
        int scoreIdx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char chrStr = dartResult.charAt(i);

            // 숫자인 경우
            if (Character.isDigit(chrStr)) {
                scoreIdx++;
                if (chrStr == '1' && i < dartResult.length() - 1 && dartResult.charAt(i + 1) == '0') {
                    score[scoreIdx] = 10;
                    i++; // '10'일 경우 다음 인덱스는 건너뛰기
                } else {
                    score[scoreIdx] = chrStr - '0';
                }
            } else {
                switch (chrStr) {
                    case 'S': // Single은 이미 기본값이므로 추가 처리 없음
                        break;
                    case 'D':
                        score[scoreIdx] = (int) Math.pow(score[scoreIdx], 2);
                        break;
                    case 'T':
                        score[scoreIdx] = (int) Math.pow(score[scoreIdx], 3);
                        break;
                    case '*':
                        if (scoreIdx > 0) {
                            score[scoreIdx - 1] *= 2; // 바로 전 점수 2배
                        }
                        score[scoreIdx] *= 2; // 현재 점수 2배
                        break;
                    case '#':
                        score[scoreIdx] *= -1; // 현재 점수 마이너스
                        break;
                }
            }
        }

        // 총 점수 계산
        int answer = 0;
        for (int n : score) {
            answer += n;
        }
        return answer;
    }
}
