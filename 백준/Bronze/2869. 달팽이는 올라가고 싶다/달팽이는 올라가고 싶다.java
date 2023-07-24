import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double A = Integer.parseInt(st.nextToken());
		double B = Integer.parseInt(st.nextToken());
		double V = Integer.parseInt(st.nextToken());
		
		int result = (int) Math.ceil((V - B) / (A - B));
		
		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();
		
	}
}