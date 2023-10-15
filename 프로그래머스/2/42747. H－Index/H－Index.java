import java.util.*;

class Solution {
    public int solution(int[] citations) {
/*
인용수 기준 내림차순 정렬 후

정렬된 상태에서의 논문 순서가 인용 수와 같거나 커지는 시점을 h index라고 한다

순서 >= 인용수
*/
        
        int answer = 0;
        
        Arrays.sort(citations);
        for(int i = citations.length-1; i >= 0; i--) {
            if(citations.length - i <= citations[i]) {
                answer++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}