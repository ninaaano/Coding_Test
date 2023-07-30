import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int n) {
        List<Integer> sequence = new ArrayList<>();
        while(n != 1) {
            sequence.add(n);
            if(n % 2 == 0) {
                n = n/2;
            } else {
                n = 3 * n + 1;
            }
        }
        sequence.add(1);
        
        int[] answer = new int[sequence.size()];
        for (int i = 0; i < sequence.size(); i++) {
            answer[i] = sequence.get(i);
        }
        return answer;
    }
}