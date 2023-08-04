class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < my_strings.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            String str = my_strings[i];
            
            if(s >= 0 && s <= e && e < str.length()) {
                if(s==e) {
                    char cStr = str.charAt(s);
                    answer.append(cStr);
                } else {
                    String subStr = str.substring(s, e+1);
                    answer.append(subStr);
                }
            }
        }
        return answer.toString();
    }
}