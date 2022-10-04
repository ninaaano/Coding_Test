import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine()," ");
        int hh = Integer.parseInt(str.nextToken());
        int mm = Integer.parseInt(str.nextToken());
        int time = Integer.parseInt(br.readLine());
        br.close();

        mm = mm+time;

        if(mm>=60) {
            int hour = mm / 60;
            if (hour > 0) {
                hh += hour;
            }
            mm = mm % 60;
        }
        if (hh >= 24)
            hh = hh-24;
        System.out.println(hh+" "+mm);
    }
}