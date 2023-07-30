import java.util.Scanner;

public class Main {
	
	/*
	 * M미터의 나무가 필요
	 * 높이 H지정하면 톱날이 땅으로부터 H미터 위로 올라감
	 * 한줄에 연속해 있는 나무를 모두 절단
	 * 높이가 H보다 큰 나무는 H위의 부분이 잘릴 것임
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int M = sc.nextInt();
		
		int tree[] = new int[num];
		
		int max = 0;
		int min = 0;

		for(int i=0; i<num; i++) {
			tree[i] = sc.nextInt();
			//최댓값 구하기
			if(tree[i] > max) {
				max = tree[i];
			}
		}
		
		//min값이 max보다 작으면 while문 break;
		//이진탐색
		while(min < max) {
			
			
			//max의 중간값
			int mid = (min+max)/2;
			long result = 0;
			
			
			for(int t:tree) {
				
				//tree의 잘린 길이의 합
				//양수만 합칠 수 있게 조건문을 달아둠
				if(t - mid > 0) {
					result += (t-mid);
				}
			}
			
			//만약 result가 M보다 작으면 자르는 위치가 높기 때문에 높이를 낮춰야 함
			if(result < M) {
				max = mid;
			}
			
			//만약 result가 M보다 크면 자르는 위치가 낮기 때문에 높이를 높여야 함
			else {
				min = mid+1;
			}
			
		}

		System.out.println(min-1);
	}

}