import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> arrList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 50 && arr[i] % 2 == 0) {
                arrList.add(arr[i] / 2);
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                arrList.add(arr[i] * 2);
            } else {
                arrList.add(arr[i]);
            }
        }
        
        int[] answer = new int[arrList.size()];
        
        for(int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        return answer;
    }
}