import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10818_B3_456ms {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String[] numbers = br.readLine().split(" ");

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(numbers[i]);
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}

		System.out.println(min + " " + max);
	}
}
