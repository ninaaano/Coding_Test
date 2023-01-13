import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        pivot_sort(arr,0,arr.length-1);

        System.out.println(arr[k-1]);
    }


    private static void pivot_sort(int[] arr, int lo, int hi) {
        // 정렬할 원소가 1개 이하기 때문에 정렬하지 않고 함수 종료한다
        if(lo>=hi) return;
        int pivot = partition(arr,lo,hi);
        // 재귀(리커시브)
        pivot_sort(arr,lo,pivot);
        pivot_sort(arr,pivot+1,hi);
    }

    private static int partition(int[] arr, int left, int right) {
        // lo와 hi는 각각 배열의 끝에서 1 벗어난 위치에서 시작한다
        int lo = left-1;
        int hi = right+1;
        int pivot = arr[(left+right)/2]; // 부분 리스트의 중앙 요소

        while(true){
            do{
                lo++;
            }while(arr[lo] < pivot) ;

            do{
                hi--;
            }while(arr[hi] > pivot && lo <= hi);

            if(lo>=hi){
                return hi;
            }

            swap(arr,lo,hi);
        }
    }

    private static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j] ;
        a[j] = temp;
    }
}
