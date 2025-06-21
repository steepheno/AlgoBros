import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 최소최대_10818 {
    public static void main(String[] args) throws IOException {

//        String input = "src/input.txt";
//        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        String[] strList = br.readLine().split(" ");

        int[] arr = Arrays.stream(strList)
                .mapToInt(Integer::parseInt)
                .toArray();


        int max = Arrays.stream(arr).max().getAsInt();
        // 스트림 max()는 OptionalInt 타입을 반환함
        int min = Arrays.stream(arr).min().getAsInt();

        System.out.println(min + " " + max);

    }
}
