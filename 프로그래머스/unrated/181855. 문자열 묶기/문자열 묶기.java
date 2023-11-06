import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> lenMap = new HashMap<>();
        
        for(String s : strArr) {
            int len = s.length();
            lenMap.put(len,lenMap.getOrDefault(len,0) + 1);
        }
        
        int max = 0;
        for(int size : lenMap.values()) {
            max = Math.max(max, size);
        }
        
        return max;
    }
}