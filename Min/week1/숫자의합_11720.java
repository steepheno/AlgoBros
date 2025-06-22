import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 숫자의합_11720 {
    public static void main(String[] args) throws IOException {

//        String input = "src/input.txt";
//        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String num = br.readLine();

        int result = 0;
        for (int i = 0; i < cnt; i++){
            result += num.charAt(i) - '0' ;
        }

        System.out.println(result);

        // N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오
        // 포인트: '0'은 아스키 코드 48임.
    }
}
