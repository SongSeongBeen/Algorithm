class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(String[] user : db) {
            if(id_pw[0].equals(user[0])) {
                return id_pw[1].equals(user[1]) ? "login" : "wrong pw";
            }
        }
        return "fail";
    }
}