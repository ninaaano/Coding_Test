import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();
        
        for(int i=l; i<=r; i++){
            if(numberContainsZeroAndFive(i)) {
                resultList.add(i);
            }
        }
        
        if (resultList.isEmpty()) {
            return new int[]{-1};
        } else {
            int[] answer = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                answer[i] = resultList.get(i);
            }
            return answer;    
        }
    }
    
    boolean numberContainsZeroAndFive(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 0 && digit != 5) {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}