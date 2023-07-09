import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
		List<String> colorArr = new ArrayList<>(); 
		
		//color배열을 List로 변환시켜준다.
		for (String num : color) {
			colorArr.add(num);
		}
		
		
		Scanner sc = new Scanner(System.in);
		int colorInput1 = colorArr.indexOf(sc.next()) * 10; //첫번째 color
		int colorInput2 = colorArr.indexOf(sc.next()); //두번째 color
		int colorInput3 = colorArr.indexOf(sc.next()); //세번째 color

		
		//인덱스번호+인덱스번호 (4+7 = 47) * 10에 마지막 color의 인덱스 번호대로 제곱해주는 식
		long result1 = (long) Math.pow(10,colorInput3); //정수의 길이가 길어지므로 long으로 받아준다.
		
		//black이 들어왔을 때 -1이 되는 것을 방지하기 위해 double로 받아준다.
		int result2 = colorInput1 + colorInput2;
		
		System.out.println((long)(result1 * result2));
		
		
	}

}