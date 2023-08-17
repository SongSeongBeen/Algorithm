class Solution {
    public String solution(String my_string, int s, int e) {
        
        String sub = my_string.substring(s, e + 1);
        String reversedSub = new StringBuilder(sub).reverse().toString();

        return my_string.substring(0, s) + reversedSub + my_string.substring(e + 1);
    }
}