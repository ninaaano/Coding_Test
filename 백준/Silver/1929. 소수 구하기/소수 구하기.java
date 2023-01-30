import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean[] prime;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        make_prime(e);

        sb = new StringBuilder();

        for(int i=s; i< prime.length; i++){
            if(!prime[i]){
                sb.append(i+"\n");
            }
        }

        System.out.println(sb);
    }

    private static void make_prime(int e) {
        prime = new boolean[e+1];

        if(e<2){
            return;
        }

        prime[0] = prime[1] = true;

        for(int i = 2; i*i<=e; i++){
            if(prime[i] == true){
                continue;
            }
            for(int j = i*i; j< prime.length; j = j+i){
                prime[j] = true;
            }
        }
    }
}
