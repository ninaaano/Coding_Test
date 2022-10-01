import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();

        br.close();

        System.out.println(a*(b.charAt(2)-'0'));
        System.out.println(a*(b.charAt(1)-'0'));
        System.out.println(a*(b.charAt(0)-'0'));
        System.out.println(a*Integer.parseInt(b));

    }
}