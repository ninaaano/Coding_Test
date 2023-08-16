import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        boolean found = false;
        int first = -1;
        int last = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (!found) {
                    first = i;
                    found = true;
                }
                last = i;
            }
        }

        if (!found) {
            return new int[]{-1};
        }

        int[] answer = Arrays.copyOfRange(arr, first, last+1);
        return answer;
    }
}