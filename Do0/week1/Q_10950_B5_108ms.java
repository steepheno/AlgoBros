import java.io.*;
import java.util.StringTokenizer;

public class Q_10950_B5_108ms {

	public static void main(String[] args) throws IOException {
		// 커밋 메세지 수정
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int T = Integer.parseInt(st.nextToken());

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			System.out.println(A + B);
		}
		br.close();
	}
}
