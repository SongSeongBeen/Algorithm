class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cardsIdx1 = 0; 
        int cardsIdx2 = 0; 
        
        for (String currentStr : goal) {
            if (cardsIdx1 < cards1.length && currentStr.equals(cards1[cardsIdx1])) {
                cardsIdx1++; 
            } else if (cardsIdx2 < cards2.length && currentStr.equals(cards2[cardsIdx2])) {
                cardsIdx2++; 
            } else {
                return "No"; 
            }

            if (cardsIdx1 == cards1.length && cardsIdx2 == cards2.length) {
                break; 
            }
        }
        
        return "Yes";
    }
}
