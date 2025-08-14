package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_17413_S3_176ms {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 입력
        String s = br.readLine();
        String[] chunk;

        // 태그 없을 때
        if (!s.contains("<")) {
            chunk = s.split(" ");  // 배열에 담기

            // 뒤집기
            for (int i = 0; i < chunk.length; i++) {
                sb.append(new StringBuilder(chunk[i]).reverse());
                if (i != chunk.length - 1) sb.append(" ");  // 마지막 단어 뒤에는 공백 안 붙이기
            }
        }

        // 태그 있을 때
        else {
            boolean isTag = false;
            StringBuilder word = new StringBuilder();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '<') {
                    sb.append(word.reverse());  // 태그 시작 전 단어 뒤집기
                    word.setLength(0);  // 버퍼 초기화

                    isTag = true;
                    sb.append(s.charAt(i));
                }

                else if (s.charAt(i) == '>') {
                    isTag = false;
                    sb.append(s.charAt(i));
                }

                else if (isTag) {
                    sb.append(s.charAt(i));  // 태그 내부 그대로 추가
                }

                else {
                    if (s.charAt(i) == ' ') {
                        sb.append(word.reverse());
                        word.setLength(0);
                        sb.append(' ');
                    }
                    else {
                        word.append(s.charAt(i));
                    }
                }
            }

            if (word.length() > 0) {
                sb.append(word.reverse());
            }
        }

        System.out.println(sb);
        br.close();

    }  // end main
}  // end class

/*
 * 문자열 S가 주어졌을 때, 단어만 뒤집는다
 * 알파벳 소문자, 숫자, 공백, 태그 특수문자(<, >)로만 구성
 * 시작과 끝은 공백이 아님
 * 연속된 단어는 공백으로 구분
 * 태그는 단어가 아님
 * S 길이 : 10만 이하
 */