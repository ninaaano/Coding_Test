import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answerList = new ArrayList<>();
        
        for(String str : intStrs) {
            String subStr = str.substring(s,s+l);
            int subNum = Integer.parseInt(subStr);
            if(subNum > k) {
               answerList.add(subNum); 
            }
        }
        int[] answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}