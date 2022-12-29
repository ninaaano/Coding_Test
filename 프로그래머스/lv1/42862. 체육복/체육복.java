// import 안해주면 에러난다
import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        //밑에 비교하는 반복문에서 0이나 n에서 앞뒤학생비교시
        //값이 없으면 Out of Index에러나옴, 이를 피하기 위해 n+2로 만든다.
        int[] student = new int[n+2];
        
        // 배열을 1로 체워준다
        Arrays.fill(student,1);
        // 사용하지 않는 배열들은 0으로 초기화시켜준다.
        student[0] = student[n+1] = 0;
        
        // 체육복을 가지고 있는 학생
        for(int i=0; i<reserve.length; i++) student[reserve[i]]++;
        
        // 체육복을 도난당한 학생
        for(int i=0; i<lost.length; i++) student[lost[i]]--;
        
        for(int i=1; i<=n; i++){
            // 체육복이 없는 학생일 때
            if(student[i]==0){
                // 앞 학생이 2벌일 때
                if(student[i-1] == 2) {
                    student[i-1]--;
                    student[i]++;
                }
                // 뒤 학생이 2벌일 때
                else if(student[i+1] == 2) {
                    student[i+1]--;
                    student[i]++;
                }
            }
        }
        // 체육복을 가지고 있는 학생 세기
        for(int i=1; i<=n; i++){
            if(student[i]!=0){
                answer++;
            }
        } 
        return answer;
    }
}