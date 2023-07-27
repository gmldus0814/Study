import java.util.Arrays;
import java.util.Scanner;


public class Main {
	

	
	int BinarySearch(int A[], int val, int low, int high) {
	      
		if(high < low)
	         return 0;
		int mid = (low + high) / 2;
	      
	    
		if(A[mid] > val) 
			return BinarySearch(A, val, low, mid - 1);
		else if(A[mid] < val)
			return BinarySearch(A, val, mid + 1, high);
		else if(A[mid] == val)
			return 1;
		else
			return 0;
	      
	}

	public static void main(String[] args) {
		
		Main b = new Main();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		Arrays.sort(A);
		
		int M = sc.nextInt();
		for(int i=0; i<M; i++) {
			int X = sc.nextInt();
			System.out.println(b.BinarySearch(A, X, 0, A.length-1));
		}
		
	}
	
}
