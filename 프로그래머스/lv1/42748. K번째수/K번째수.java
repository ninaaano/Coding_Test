import java.util.*;

class Solution {
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        
        for(int[] command : commands){
            int start = command[0]; // 첫번째
            int end = command[1]; // 두번째
            
            int[] arr = new int[end-start+1]; // 5에서 2빼고 1 더하면 
            
            for(int i = start-1, j=0; i<end; j++,i++){
                arr[j] = array[i];
            }
            Arrays.sort(arr);
            int target = command[2];
            answer[cnt++] = arr[target-1];  
        }    
        return answer;
    }
}