class Solution {
    public String solution(String code) {
        int mode = 0; // 시작할 때 mode는 0
        StringBuilder ret = new StringBuilder();

        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx);

            if (mode == 0) {
                if (currentChar != '1') {
                    if (idx % 2 == 0) {
                        ret.append(currentChar);
                    }
                } else {
                    mode = 1;
                }
            } else { // mode == 1
                if (currentChar != '1') {
                    if (idx % 2 != 0) {
                        ret.append(currentChar);
                    }
                } else {
                    mode = 0;
                }
            }
        }

        // ret가 빈 문자열인 경우 "EMPTY" 반환
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}