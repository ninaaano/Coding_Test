import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 1; j <= arr[i]; j++) {
                answer.add(arr[i]);
            }
        }
        
        int[] result = new int[answer.size()];
        
        for(int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}