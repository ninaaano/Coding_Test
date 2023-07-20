class Solution {
    public int solution(int n) {
        int result = 0;
        if (n % 2 == 1) { // 홀수
            for (int i = 1; i <= n; i += 2) {
                result += i;
            }
        } else { // 짝수
            for (int i = 2; i <= n; i += 2) {
                result += i * i;
            }
        }
        return result;
    }
}