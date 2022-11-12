import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        StringBuffer sb = new StringBuffer(a);
//        StringBuffer sb2 = new StringBuffer(b);
//
//        int reverse = Integer.parseInt(sb.append(a).reverse().toString());
//        int reverse2 = Integer.parseInt(sb2.append(b).reverse().toString());
//
//        if(reverse > reverse2)
//            System.out.println(reverse);
//        else
//            System.out.println(reverse2);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int a = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));
        int b = Integer.parseInt(String.valueOf(new StringBuilder(st.nextToken()).reverse()));

        if(a>b){
            System.out.println(a);
        }else
            System.out.println(b);
    }
}
