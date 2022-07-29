class Solution {
    public int[] solution(int[] arr) {
        
        // 1개 일때 -1 리턴
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        // min에 최솟값 집어넣기
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            min = Math.min(min,arr[i]);            
        } 
        
        int[] answer = new int[arr.length-1];
        int temp = 0;
        
        for(int i=0; i<arr.length; i++){
            if(min == arr[i]){
                continue;
            }
            answer[temp++] = arr[i] ;
        }

        return answer;
    }
}


