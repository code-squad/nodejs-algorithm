import java.util.PriorityQueue;

//https://programmers.co.kr/learn/courses/30/lessons/42626

/*
1. 스코빌 지수가, 숫자대로 정렬되어야 한다는 점에서 우선순위 큐를 이용하여 풀었음.

*/

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int answer = 0;
        for(int input : scoville){
            pq.add(input);
        }
        
        while(pq.peek() < K){
            if(pq.size() == 1){
                return -1;
            }
            
            int lowest = pq.poll();
            int slowest = pq.poll();
            int mix = lowest + (slowest * 2);
            pq.add(mix);
            answer++;
        }
        return answer;
    }
}