class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        // 비트 연산자 사용
        String[] answer = new String[n];
        for(int i =0; i<n; i++){
            String result = "";
            int arr = arr1[i]|arr2[i];
            int target = 1;
            for(int j=0;j<n;j++){
                result = ((arr&target)>0?"#":" ")+result;
                target = target << 1;
            }
            answer[i] = result;
        }
        return answer;
    }
}