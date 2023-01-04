
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] color = {"black", "brown", "red", "orange", "yellow",
                "green", "blue", "violet", "grey", "white"};

        HashMap<String, Integer> colorNumberMap = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            colorNumberMap.put(color[i], i);
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c1 = br.readLine();
        String c2 = br.readLine();
        String c3 = br.readLine();

        int n1 = colorNumberMap.get(c1);
        int n2 = colorNumberMap.get(c2);
        int n3 = colorNumberMap.get(c3);

        long num = (long) Math.pow(10,n3);

        String s1 = String.valueOf(n1);
        String s2 = String.valueOf(n2);
        String s3 = s1+s2;

        System.out.println(Integer.parseInt(s3) * num);

    }
}
