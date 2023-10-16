class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3];
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int maxScore = 0;
        
        for(int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) {
                score[0]++;
                maxScore = Math.max(maxScore, score[0]);
            }
            if (answers[i] == pattern2[i % pattern2.length]) {
                score[1]++;
                maxScore = Math.max(maxScore, score[1]);
            }
            if (answers[i] == pattern3[i % pattern3.length]) {
                score[2]++;
                maxScore = Math.max(maxScore, score[2]);
            }
        }
        
        int count = 0;
        for(int i = 0; i < score.length; i++) {
            if(score[i] == maxScore) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int index = 0;
        for(int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                answer[index++] = i + 1;
            }
        }
        
        return answer;
    }
}