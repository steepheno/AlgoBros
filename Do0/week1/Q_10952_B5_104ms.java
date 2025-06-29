import java.io.*;
import java.util.StringTokenizer;

public class Q_10952_B5_104ms {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String str;

		while (true) {
			str = br.readLine();
			st = new StringTokenizer(str, " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if (A == 0 && B == 0) {
				break;
			}
			System.out.println(A + B);
		}
		br.close();
	}
}
