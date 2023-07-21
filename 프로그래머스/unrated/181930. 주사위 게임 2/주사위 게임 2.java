class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a + b + c;
        int sumSquared = a * a + b * b + c * c;
        int sumCubed = a * a * a + b * b * b + c * c * c;

        if (a == b && b == c) { // 세 숫자가 모두 같은 경우
            answer = sum * sumSquared * sumCubed;
        } else if (a == b || b == c || a == c) { // 두 숫자가 같고 나머지 숫자가 다른 경우
            answer = sum * sumSquared;
        } else { // 세 숫자가 모두 다른 경우
            answer = sum;
        }

        return answer;
    }
}