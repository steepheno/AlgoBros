import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2562_B3_100ms {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numbers[] = new int[9];
		int max = 0;
		int index = 0;

		for (int i=0; i<9; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
			if (numbers[i] > max) {
				max = numbers[i];
				index = i;
			}
		}
		System.out.println(max);
		System.out.println(index+1);
	}
}
