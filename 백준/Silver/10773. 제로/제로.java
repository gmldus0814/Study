import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<>();
		int arrInput;
		int arrResult = 0;
		
		for(int i = 0; i < K; i++) {
			arrInput = sc.nextInt();
			if (arrInput == 0) {
				arr.remove(arr.size()-1);
			}
			else {
				arr.add(arrInput);
			}
		}
		for(int i = 0; i < arr.size(); i++) {
			arrResult += arr.get(i);
		}
		
		System.out.println(arrResult);

	}

}