import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_9012_S4_116ms {
    public static void main(String[] args) throws IOException {

        String input = "src/input.txt";
//        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++){
            char[] arr = br.readLine().toCharArray();


            int right = 0;
            boolean isValid = true;

            for(int i = 0; i < arr.length; i++){
                if (arr[i] == '('){
                    right += 1;
                } else if (arr[i] == ')') {
                    right -= 1;
                }

                if (right < 0){
                    isValid = false;
                    break;
                }

            }

            if (right != 0) {
                isValid = false;
            }

            System.out.println(isValid ? "YES" : "NO");
        }


    }

        /*
        올바른 괄호 VPS

        VPS면 YES 아니면 NO출력.
         */

}

