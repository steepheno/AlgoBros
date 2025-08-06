import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Q_무지의_먹방_라이브 {
    public static void main(String[] args) throws IOException {
        String file = "src/input.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));

        int[] food_times = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        long k = Long.parseLong(br.readLine());

        int answer = solution(food_times, k);
        System.out.println(answer);
    }

    public static int solution(int[] food_times, long k) {
        int n = food_times.length;

        // 우선순위 큐: 음식 시간 기준 오름차순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{food_times[i], i});
        }

        long totalTime = 0;
        long prevTime = 0;

        // 가장 적은 시간이 걸리는 음식부터 처리
        while (!pq.isEmpty()) {
            long currentTime = pq.peek()[0];
            long timeToEat = (currentTime - prevTime) * pq.size();

            // k초 안에 현재 음식을 다 먹을 수 없는 경우
            if (totalTime + timeToEat > k) {
                break;
            }

            // 현재 음식을 다 먹을 수 있는 경우
            totalTime += timeToEat;
            prevTime = currentTime;
            pq.poll(); // 이 음식은 다 먹었음.
        }

        // 더 이상 먹을 음식이 없는 경우
        if (pq.isEmpty()) {
            return -1;
        }

        // 남은 시간 계산
        long remainingTime = k - totalTime;

        // 남은 음식들을 인덱스 순으로 정렬
        List<int[]> remainingFoods = new ArrayList<>(pq);
        remainingFoods.sort((a, b) -> Integer.compare(a[1], b[1]));

        // 남은 시간만큼 순회한 후의 음식 인덱스 반환 (1-based)
        int targetIndex = (int) (remainingTime % remainingFoods.size());
        return remainingFoods.get(targetIndex)[1] + 1;
    }
}


/*
1, 2, 3 -> 인덱스로 체크를해서
[3, 1, 2]	5 초 /이런게 있잖아?

sort해서  

1. for문으로 1개1개 깎기 1차 시간초과 x
2. sort x초동안 하는거니
3. arr length / 
4. 시간초과.
/////////////////////////////////////////////////////////
*/