import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Queue 선입 선출
//N장의 카드가 있다.
//차례로 1부터 N까지의 번호
//1번 카드가 제이리 위에, N번 카드가 제일 아래인 상태로 순서대로
//1을 버리면 234 -> 2를 제일 아래로 옮기기
// 342 3을 버리면 -> 4를 아래로 옮기기 24

/*
 * 123456 -> 1을 버리고 2을 뒤로
	34562 -> 3을 버리고 4을 뒤로
	5624 -> 5를 버리고 6을 뒤로
	246 -> 2를 버리고 4를 뒤로
	64 -> 6를 버린다. 종료
 */

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		

			for (int i=1; i<num+1; i++) {
				queue.offer(i); //queue방식 줄세우기
			}
			
			while(queue.size() > 1) { //남은 줄이 1개일 경우 종료
				queue.poll(); //맨앞에 원소를 버린다.
				queue.offer(queue.poll()); //버
			}
			
			System.out.println(queue.poll()); //남은 원소 출력

		}

}

