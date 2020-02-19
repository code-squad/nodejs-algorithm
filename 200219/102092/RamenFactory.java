import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
https://programmers.co.kr/learn/courses/30/lessons/42629

1. heap 이니까 우선순위 큐를 이용해봐야할듯.
2. 왜? 공급횟수를 최소로 해야하니까.
3. 주어진 매개변수를 모두 사용할 수 있도록 하자.

 */

public class RamenFactory {

    class Solution {

        public int solution(int stock, int[] dates, int[] supplies, int k) {
            int answer = 0;
            int index = 0;
            Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

            for (int day = 0; day < k; day++) {

                if (index < dates.length && day == dates[index]) {
                    pq.add(supplies[index]);
                    index++;
                }

                if (stock == 0) {
                    stock += pq.poll();
                    answer++;
                }
                stock--;
            }

            return answer;
        }
    }
}