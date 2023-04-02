class Solution {
    public int solution(int chicken) {
        final int COUPON = 10;
        int answer = 0;
        while (chicken >= COUPON) {
            answer += chicken / COUPON;
            chicken = chicken / COUPON + chicken % COUPON;
        }
       
        return answer;
    }
}