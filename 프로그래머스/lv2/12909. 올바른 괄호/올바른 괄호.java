import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        // String 배열로 담으니까 시간초과가 나는 것 같다
        char[] sc = s.toCharArray();
        // String 으로 했을 때 시간초과가 난다
        Stack<Character> stack = new Stack<>();
        
        int N = sc.length;
        
        // 첫번째가 ) 면 다음이 ( 이므로 닫을 수 없다
        if(sc[0] == ')'){
            return false;
        }
        
        // 홀수는 나눌 수 없다
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