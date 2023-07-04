import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader (new InputStreamReader (System.in));
		 StringBuilder sb = new  StringBuilder();
		
		Integer num1 = (Integer.parseInt(bf.readLine()));
		
		ArrayList<Integer> num2 = new ArrayList<Integer>();

		
		for (int i=0; i<num1; i++) {
			num2.add(Integer.parseInt(bf.readLine()));
		}
		
		Collections.sort(num2);

		for (int i=0; i<num1; i++) {
			sb.append(num2.get(i)).append("\n");
		}
		System.out.println(sb);

	}

}