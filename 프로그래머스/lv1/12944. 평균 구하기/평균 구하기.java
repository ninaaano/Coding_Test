class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double avg = 0;
        
        for(int i:arr){
            avg += i;
        }
        
        answer = avg / arr.length;
        return answer;
    }
}


