import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < names.length; i += 5) {
            String[] group = new String[Math.min(5, names.length - i)];
            System.arraycopy(names, i, group, 0, group.length);
            result.add(group[0]);
        }
        
        return result.toArray(new String[result.size()]);
    }
}