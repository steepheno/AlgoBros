import java.io.*;

public class Q_2475_B5_100ms {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] arr = br.readLine().split(" ");

		int sum = 0;
		for (String i : arr) {
			int n = Integer.parseInt(i);
			sum += n * n;
		}

		bw.write(String.valueOf(sum % 10));
		bw.flush();
		br.close();
		bw.close();
	}
}
