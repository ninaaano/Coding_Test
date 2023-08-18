import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = new String[0];
        int idx = 0;
        
        for (String i : str_list) {
            if (i.equals("l")) {
                answer = Arrays.copyOfRange(str_list, 0, idx);
                break;
            } else if (i.equals("r")) {
                answer = Arrays.copyOfRange(str_list, idx + 1, str_list.length);
                break;
            }
            idx++;
        }
        
        return answer;
    }
}