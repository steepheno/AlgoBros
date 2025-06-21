import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열반복_2675 {
    public static void main(String[] args) throws IOException {

//        String input = "src/input.txt";
//        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine());

        for (int t = 0; t < tc; t++){

            String[] inputStr = br.readLine().split(" ");

            String result = "";

            int a = Integer.parseInt(inputStr[0]);

            for (int i = 0; i < inputStr[1].length(); i++){
                char forResult = inputStr[1].charAt(i);

                for (int j = 0; j < a; j++){
                    result += forResult;
                }
            }

            System.out.println(result);

        }

    }
}
