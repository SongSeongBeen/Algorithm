class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        int minLength = Math.min(str1.length(), str2.length()); //예외방지

        for(int i = 0; i < minLength; i++){
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        }
        
        return sb.toString();
    }
}