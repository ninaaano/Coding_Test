import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 28개의 번호를 담을 배열 선언. 남은 값은 0으로 들어간다.
        int[] student = new int[31];

        // 입력은 for문이 돌아갈때 같이 입력받지 않으면 첫 입력값만 받게된다.
        for(int i=1; i<=28; i++){
            int userInputNumber = Integer.parseInt(br.readLine());
            student[userInputNumber]++;
        }

        /*
        두번째 for문은 1부터 시작해야한다. 0부터 시작했을 때 0이 출력된다
        1로 바꿨을 때 배열의 길이는 30이 아니라 31이여야 한다. 30으로 했을 때 student.length까지 받았을때 1개만 뱉는다
         */
        
        for(int i=1; i<student.length; i++){
            if(student[i]==0){
                System.out.println(i);
            }
        }

    }
}
