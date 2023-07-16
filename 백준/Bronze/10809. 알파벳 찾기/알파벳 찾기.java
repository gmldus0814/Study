import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		
		//단어 입력 받기
		String S = sc.next();
		
		for(char i='a'; i<='z'; i++) {
			str.append(S.indexOf(i)+" ");
		}
		System.out.println(str);
		
	}
}
