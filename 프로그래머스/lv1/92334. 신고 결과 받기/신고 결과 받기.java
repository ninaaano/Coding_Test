import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportHash = new HashMap<>();
        HashMap<String, HashSet<String>> resultHash = new HashMap<>();
        
        for(String r : report){
            // 신고유저, 신고당한 유저를 공백을 기준으로 분리
            String[] str = r.split(" ");
            if(reportHash.containsKey(str[0])==false)
                reportHash.put(str[0], new HashSet<>());
            // set에서 가져와서 불량유저 추가
            reportHash.get(str[0]).add(str[1]);
            // 최초인지 확인
            if(resultHash.containsKey(str[1])==false)
                resultHash.put(str[1], new HashSet<>());
            resultHash.get(str[1]).add(str[0]);
        }
        // id 갯수만큼 생성
        int[] answer = new int[id_list.length];
        for(int i=0; i<answer.length; i++){
            String user = id_list[i];
            // 신고한 유저가 없으면 받을 메일이 없으므로 건너뛴다
            if(reportHash.containsKey(user)==false) continue;
            // bad = 신고한 유저 목록
            for(String bad : reportHash.get(user))
                if(resultHash.get(bad).size()>=k)
                    answer[i]++;
        }
        return answer;
    }
}