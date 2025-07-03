package class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_28702_B1_108ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        Object tempNum = 0;
        int nextNum = 0;

        // str1이 숫자
        if (isInteger(str1) instanceof Integer) {
            tempNum = isInteger(str1);
            nextNum = (int) tempNum + 3;
        }

        // str2가 숫자
        else if (isInteger(str2) instanceof Integer) {
            tempNum = isInteger(str2);
            nextNum = (int) tempNum + 2;
        }

        // str3이 숫자
        else {
            tempNum = isInteger(str3);
            nextNum = (int) tempNum + 1;
        }

        // 3의 배수나 5의 배수에 해당되는지 확인
        if (nextNum % 3 == 0 && nextNum % 5 == 0) {
            sb.append("FizzBuzz");
        }
        else if (nextNum % 3 == 0) {
            sb.append("Fizz");
        }
        else if (nextNum % 5 == 0) {
            sb.append("Buzz");
        }
        else {
            sb.append(nextNum);
        }

        System.out.println(sb);
        br.close();

    }  // end main

    static Object isInteger(String str) {
        try {
            return Integer.parseInt(str);
        }
        catch (NumberFormatException e) {
            return str;
        }
    }
}  // end class

/*
 * 연속된 세 문자열에 대하여
 * i가 3의 배수이고 5의 배수가 아니면 Fizz 출력
 * i가 3의 배수가 아니고 5의 배수이면 Buzz 출력
 * i가 3의 배수이면서 5의 배수이면 FizzBuzz 출력
 * 그 외 경우에는 i 그대로 출력
 * i는 최대 8자리
 *
 */