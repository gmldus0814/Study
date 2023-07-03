import java.util.Scanner;

public class Main {
	public static void main(String []ar) {
		Scanner sc = new Scanner(System.in);
		int year, result;

		year = sc.nextInt();
		
		if(year >= 1000 && year <= 3000) {
			result = year - 543;
			System.out.println(result);
		}
		else {
			System.out.println("다시 입력해주세요.");
		}
	}
}
