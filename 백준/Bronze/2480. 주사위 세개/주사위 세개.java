import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine()," ");
        int one = Integer.parseInt(str.nextToken());
        int two = Integer.parseInt(str.nextToken());
        int three = Integer.parseInt(str.nextToken());
        br.close();

        int gold = 0;

        if(one==two || one==three){
            gold = 1000+one*100;
            if(two==three){
                gold = 10000+one*1000;
            }
        }else if(two==three){
            gold = 1000+two*100;
            if(one==three){
                gold = 10000+two*1000;
            }
        }else
            if(one>two && one>three){
                gold = one*100;
            }else if(two>one && two>three){
                gold = two*100;
            }else if(three> one && three>two)
                gold = three*100;

        System.out.print(gold);

    }
}