import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int a = 0;
        if (num_list[n - 1] > num_list[n - 2]) {
            a = num_list[n - 1] - num_list[n - 2];
        } else if (num_list[n - 1] <= num_list[n - 2]) {
            a = num_list[n - 1] * 2;
        }

        int[] result = Arrays.copyOf(num_list, n + 1);
        result[n] = a;

        return result;
    }
}