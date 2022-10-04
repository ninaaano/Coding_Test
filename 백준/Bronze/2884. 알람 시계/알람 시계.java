import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());
        int hh = Integer.parseInt(str.nextToken());
        int mm = Integer.parseInt(str.nextToken());
        
        br.close();

        if(mm < 45) {
            hh--; // 시 감소
            mm = 60 - (45-mm); // 분 감소
            if(hh<0){
                hh = 23;
            }
            System.out.println(hh+" "+mm);
        }else
            System.out.println(hh+" "+(mm-45));
    }
}