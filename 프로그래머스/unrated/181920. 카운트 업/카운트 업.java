class Solution {
    public int[] solution(int start, int end) {
        // 아래와 같은 방법도 있다
        // IntStream.rangeClosed(start, end).toArray();
        int[] answer = new int[end-start+1];
        for(int i=0; i<answer.length; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}