import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A플B_3_10950 {
    public static void main(String[] args) throws IOException {

//        String input = "src/input.txt";
//        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());

        for (int i = 0; i< cnt; i++){
            String[] inputStr = br.readLine().split(" ");

            int sum = Integer.parseInt(inputStr[0]) + Integer.parseInt(inputStr[1]);

            System.out.println(sum);

        }

//        두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    }
}
