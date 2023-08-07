import java.util.Arrays;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] arr = new String[my_string.length()];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = my_string.substring(i);
        }
        Arrays.sort(arr);
        
        for(String sub : arr) {
            if(sub.equals(is_suffix)) {
                return 1;
            }
        }
        
        return answer;
    }
}