class Solution {
    public String solution(String s) {
        String answer = "";
        int temp = 0;
        
        String [] str = s.split("");
        
        for(String a : str){
            // a가 0을 포함하고 있으면 0 리턴, 아니면 +1
            temp = a.contains(" ")? 0 : temp + 1;
            
            
            answer += (temp%2==0)?a.toLowerCase():a.toUpperCase();
        }
        
        return answer;
    }
}