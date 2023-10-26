class Solution {
    public String solution(String myString, String pat) {
        // pat의 마지막 등장 위치를 찾음
        int index = myString.lastIndexOf(pat); 
        
        // 해당 위치까지의 부분 문자열을 반환
        return myString.substring(0, index + pat.length()); 
    }
}