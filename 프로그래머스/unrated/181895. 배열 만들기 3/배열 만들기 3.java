import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] first = new int[intervals[0][1] - intervals[0][0] + 1];
        int[] second = new int[intervals[1][1] - intervals[1][0] + 1];
        
        List<Integer> list = new ArrayList<>();
        
        int idx = 0;
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++) {
            first[idx++] = arr[i];
        }
        
        idx = 0;
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++) {
            second[idx++] = arr[i];
        }
        
        for(int i : first) {
            list.add(i);
        }
        
        for(int i : second) {
            list.add(i);
        }
        
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}