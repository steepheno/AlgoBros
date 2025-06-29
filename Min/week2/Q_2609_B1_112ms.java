import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2609_B1_112ms {
    public static void main(String[] args) throws IOException {

        String input = "src/input.txt";
//        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        String[] inputStr = br.readLine().split(" ");
        int A = Integer.parseInt(inputStr[0]);
        int B = Integer.parseInt(inputStr[1]);

        int originalA = A;
        int originalB = B;

        int resultA = 1;

        int divide = 2;

        while (divide <= A && divide <= B){

            while ((A % divide == 0) && (B % divide == 0)){
                A = A / divide ;
                B = B / divide ;

                resultA *= divide;
            }
            divide ++;
        }

        System.out.println(resultA);
        System.out.println(originalA * originalB / resultA);



        /*
        두 자연수를 입력 받아 최대 공약수, 최소 공배수 출력

        최대 공약수 구하는법?
        나누어지는것을 계속 동시에 나눠보면됨.
         */

    }
}
