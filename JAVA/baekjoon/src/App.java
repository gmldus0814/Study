import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        if(a>b) System.out.println(">");
        else if(a<b) System.out.println("<");
        else System.out.println("==");
        
    }
}
