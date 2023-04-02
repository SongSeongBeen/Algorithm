class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
            for(String[] user : db){
                System.out.println(id_pw[0].equals(user[0]) && id_pw[1].equals(user[1]));
                if(id_pw[0].equals(user[0]) && id_pw[1].equals(user[1])){
                    answer ="login";
                } else if(id_pw[0].equals(user[0]) && !id_pw[1].equals(user[1])) {
                    answer = "wrong pw";
                } else if(!id_pw[0].equals(user[0]) && !id_pw[1].equals(user[1])) {
                    answer = "fail";
                }
            }
        return answer;
    }
}