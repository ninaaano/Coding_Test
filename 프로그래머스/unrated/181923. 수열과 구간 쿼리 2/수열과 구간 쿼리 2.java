import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int minGreater = -1;
            for (int j = s; j <= e; j++) {
                if (arr[j] > k && (minGreater == -1 || arr[j] < minGreater)) {
                    minGreater = arr[j];
                }
            }

            answer[i] = minGreater;
        }

        return answer;
    }
}
