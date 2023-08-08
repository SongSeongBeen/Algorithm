class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        if (s >= my_string.length()) {
            return my_string; 
        }

        StringBuilder sb = new StringBuilder(my_string);
        for (int i = 0; i < overwrite_string.length() && s + i < sb.length(); i++) {
            sb.setCharAt(s + i, overwrite_string.charAt(i));
        }

        if (s + overwrite_string.length() > sb.length()) {
            sb.append(overwrite_string.substring(sb.length() - s));
        }

        return sb.toString();
    }
}
