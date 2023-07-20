class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
    int maxLength = str1.length() + str2.length(); // 두 문자열을 합친 길이
    
    for (int i = 0; i < maxLength; i++) {
        if (i < str1.length()) {
            answer += str1.charAt(i);
        }
        if (i < str2.length()) {
            answer += str2.charAt(i);
        }
    }
        return answer;
        
    }
}