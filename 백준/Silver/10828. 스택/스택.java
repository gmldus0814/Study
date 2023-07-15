import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer; 

public class Main {
	


	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> stack = new Stack<>();
		
		int num = Integer.parseInt(bf.readLine());
		
		for(int i=0; i<num; i++) {
			StringTokenizer commend = new StringTokenizer(bf.readLine());
			
			switch(commend.nextToken()){
			case "push":
				int pushNum = Integer.parseInt(commend.nextToken());
				stack.push(pushNum);
				break;
			case "pop":
				if(stack.size() == 0) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.peek());
					stack.pop();
				}
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				if(stack.empty()== true) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				break;
			case "top":
				if(stack.empty() == true) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.peek());
				}
				break;
			}
		}
	
	}

}