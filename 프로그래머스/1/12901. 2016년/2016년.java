import java.util.Calendar;

class Solution {

    private static final String[] CONST_DAYS_OF_WEEK = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    public String solution(int a, int b) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, a - 1, b);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        // 직접 요일 문자열 반환
        return CONST_DAYS_OF_WEEK[dayOfWeek - 1];
    }
}
