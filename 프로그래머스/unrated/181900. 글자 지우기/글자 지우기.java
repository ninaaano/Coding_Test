import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = IntStream.range(0, my_string.length())
                .filter(i -> !Arrays.stream(indices).anyMatch(index -> index == i))
                .mapToObj(my_string::charAt)
                .map(String::valueOf)
                .collect(Collectors.joining());

        return answer;
    }
}