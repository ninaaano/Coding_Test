class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i=0; i<number.length(); i++) {
            int num = number.charAt(i) - 48;
            answer += num;
        }
        int sum = answer % 9;
        return sum;
    }
}