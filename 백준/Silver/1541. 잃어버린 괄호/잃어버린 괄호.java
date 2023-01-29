import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] number = input.split("[+-]+");
        String[] operator = input.split("[0-9]+");
        int answer = Integer.parseInt(number[0]);

        for (int i = 0; i < operator.length-1; i++) {
            if (operator[i+1].equals("-")) {
                while(i < number.length-1){
                    answer -= Integer.parseInt(number[i+1]);
                    i++;
                }
                break;
            }
            answer += Integer.parseInt(number[i+1]);
        }

        System.out.println(answer);

    }
}
