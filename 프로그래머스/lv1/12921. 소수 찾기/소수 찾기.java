class Solution {
    public int solution(int n) {
        int answer = 0;
        // arr는 n+1만큼의 공간을 가짐
        int[] arr = new int[n+1];
       
        // 배열 한번에 체우기 (왜 에러가날까?ㅜㅜ)
       // Arrays.fill(arr,1);
 
        for(int i=0; i<=n; i++){
            arr[i]=i; // [n-1] = n , [0] = 1
        }

        // 1은 소수가 아니기 때문에 0
        arr[0] = 0;
        arr[1] = 0;
        
        // 에라토스테네스의 체
        for(int i=2; i<=n; i++){
		    for(int j = i+i; j<=n; j+=i) {
				//i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
                    arr[j]=0;
			}
		}
        
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
            answer++;
         }
        }
        
/* 참고 코드


        // 모든 수를 대입
        for(int i=0;i<=n;i++){  // int타입 i; 0부터 n이하까지 반복; i++
            arr[i]=i;   // arr의 i번째 방은 i이다
        }// 0번째 방은 =1, n-1번째 방은 =n이 된다

        // 1은 소수가 아니라서 0이라고 정의 --> 0이라고 함 
        arr[1]=0;   // arr의 1번째 방은 0

        // 소수 찾기 시작
        for(int i=2;i<=n;i++){//2부터 계산해줌        int타입 i는 2; i가 n이하까지 반복; i++

            // 만약 이전에 찾았던 소수의 배수 값일 경우 계산없이 다음 수로 이동
            if(arr[i]==0)continue;  // arr[i]번째 방이 0이라면 반복문의 처음으로 이동

            // 에라토스테네스의 체를 통해 배수의 수는 소수가 아니라고 정의
            for(int j=i*2;j<=n;j+=i){   // int타입 j가 i*2이고; j가 n이하까지 반복; j = j+i -> 계산을 하지않고 소수가 아닌 값을 찾음
                arr[j]=0;   // arr의 j번째 방은 0 -> 소수가 아니라면
            }
        }

            // 정답 계산
        for(int i=0;i<arr.length;i++){  // int타입 i는 arr의 길이 미만동안 반복 i++
            if(arr[i]!=0){  // arr의 i번째 방이 0이 아니라면 -> 소수
                answer++;   // answer++
            }
        }



*/
        return answer;
    }
}