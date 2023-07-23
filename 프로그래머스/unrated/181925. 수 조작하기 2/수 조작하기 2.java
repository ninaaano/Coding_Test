class Solution {
    public String solution(int[] numLog) {
        StringBuilder controlBuilder = new StringBuilder();
        
        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1];
            if (diff == 1) {
                controlBuilder.append("w");
            } else if (diff == -1) {
                controlBuilder.append("s");
            } else if (diff == 10) {
                controlBuilder.append("d");
            } else if (diff == -10) {
                controlBuilder.append("a");
            }
        }
        
        return controlBuilder.toString();
    }
}
