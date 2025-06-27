import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1978_B2_108ms {
    public static void main(String[] args) throws IOException {

        String input = "src/input.txt";
//        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int result = 0;

        for (int i = 0; i < N; i++) {
            int number = numbers[i];

            if (number == 1) {
                continue;  // 1은 소수가 아니므로 패스
            }

            boolean preResult = true;


            int cnt = 2;
            while (cnt <= number - 1) {
                if (number % cnt == 0) {
                    preResult = false;
                    break;
                }
                cnt++;
            }

            if (preResult) {
                result++;
            }
        }

        System.out.println(result);

        /*
        소수 찾기
        N개중 소수가 몇개인지 찾아서 출력하는 프로그램 만들기.
        소수 = 1 혹은 자기외에 나눠지면 안 됨.

        1... 본인까지 나누면서 안나눠지면 성공

         */

    }
}
