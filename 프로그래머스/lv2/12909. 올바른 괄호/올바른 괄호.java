import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // String 배열로 담으니까 시간초과가 나는 것 같다
        char[] sc = s.toCharArray();
        // String 으로 했을 때 시간초과가 난다
        Stack<Character> stack = new Stack<>();
        
        int N = sc.length;
        
        
        if(sc[0] == ')'){
            return false;
        }
        
        if(N%2 == 1){
            return false;
        }
        
        
        
        for (int i = 0; i < N; i++) {
            
            if (sc[i] == '(') {
                stack.push(sc[i]);
            }
            if (sc[i] == ')') {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty()? answer : false;

    }
}