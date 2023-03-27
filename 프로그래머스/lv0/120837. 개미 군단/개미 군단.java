class Solution {
    public int solution(int hp) {        
        int answer = 0;
      
        int g = hp/5; //장군 수
        hp %= 5;      //장군공격
        int s = hp/3; //병정 수
        hp %= 3;      //장군공격후 병정공격
        answer = g+s+hp;
        return answer;
    }
}