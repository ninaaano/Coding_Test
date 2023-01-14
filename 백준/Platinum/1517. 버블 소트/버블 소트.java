import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static long swapped;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(arr,0,n-1);
        System.out.println(swapped);
    }

    private static long merge_sort(int[] arr, int start, int end) {
        if(start == end){
            return 0;
        }
        int mid = (start+end)/2;
        int[] sorted = new int[end-start+1];
        swapped = merge_sort(arr,start,mid) + merge_sort(arr,mid+1,end);
        {
            int left = start; // 앞 부분 인덱스
            int right = mid+1; // 뒷 부분 인덱스
            int k = 0;

            while(left <= mid || right <= end){
                if(left <= mid && (right > end || arr[left] <= arr[right])){
                    sorted[k++] = arr[left++];
                }else{
                    swapped += (long) (mid-left+1);
                    sorted[k++] = arr[right++];
                }
            }
        }
        for(int i = start; i<= end; i++){
            arr[i] = sorted[i-start];
        }
        return swapped;
    }
}
