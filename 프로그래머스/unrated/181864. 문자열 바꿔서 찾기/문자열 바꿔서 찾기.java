class Solution {
    public int solution(String myString, String pat) {
         myString = myString.replace('A', 'Z').replace('B', 'A').replace('Z', 'B');
         return myString.contains(pat) ? 1 : 0;
    }
}