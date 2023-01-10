import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 선택정렬 자체는 구현 방법이 복잡하고 시간 복잡도가 비효율적이기 때문에 코테에서 많이 나오진 않지만,
 * 응용해서 나올 순 있기 때문에 이번 문제는 선택 정렬을 이용해서 풀어본다
 * 정렬 자체는 내장 함수를 사용해서 풀 수도 있다
 * 1. 남은 정렬 부분에서 최솟값 또는 최댓값을 찾는다
 * 2. 남은 정렬 부분에서 가장 앞에 있는 데이터와 선택된 데이터를 swap
 * 3. 가장 앞에 있는 데이터의 위치를 변경해(index++) 남은 정렬 부분 범위 축소
 * 4. 전체 데이터 크기만큼 index가 커질 때까지, 남은 정렬 부분이 없을 때 까지 반복한다
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[str.length()];
        for(int i=0; i<str.length(); i++){
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }
        for(int i=0; i<str.length(); i++){
            int max = i;
            for(int j=i+1; j<str.length(); j++){
                if(arr[j] > arr[max]) // 내림차순이므로 최댓값을 찾음
                    max = j;
            }
            if(arr[i] < arr[max]){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(arr[i]);
        }

    }
}
