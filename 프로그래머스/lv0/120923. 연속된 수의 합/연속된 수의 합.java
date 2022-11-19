class Solution {
    public int[] solution(int num, int total) {

        int[] answer = new int[num];

        int temp = total / num;
        int count = 0;

        if(total % num == 0){
            count = num / 2;
        }else
            count = num / 2 - 1;
        
        int result = temp - count;

        for (int i = 0; i < answer.length; i++) {
            answer[i]= result + i; 
        }
        return answer;
    
    }
}