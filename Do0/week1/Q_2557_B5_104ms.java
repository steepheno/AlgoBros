import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Q_2557_B5_104ms {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("Hello World!");
		bw.flush();
		bw.close();
	}
}
