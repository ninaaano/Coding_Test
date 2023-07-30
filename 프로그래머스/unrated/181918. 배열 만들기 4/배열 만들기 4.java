import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        while (i < arr.length) {
            if (stack.isEmpty() || stack.peek() < arr[i]) {
                stack.push(arr[i]);
                i++;
            } else if (stack.peek() >= arr[i]) {
                stack.pop();
            }
        }

        int[] result = new int[stack.size()];
        for (int j = stack.size() - 1; j >= 0; j--) {
            result[j] = stack.pop();
        }

        return result;
    }
}
