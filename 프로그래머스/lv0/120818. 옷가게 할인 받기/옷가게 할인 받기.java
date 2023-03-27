class Solution {
public int solution(int price) {
int answer = 0;
int n = price/10000;
    	answer = (n >= 50 ? (int)(price-price*0.2) : n >= 30 ? (int)(price-price*0.1) : n >= 10 ? (int)(price-price*0.05) : price);
return answer;
}
}