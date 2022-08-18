class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a==b)
            return a;
        
        int c = Math.max(a,b);
        int d = Math.min(a,b);
        
        for(int i = d; i <= c; i++){
            answer += i ;
        }
        
        return answer;
    }
}