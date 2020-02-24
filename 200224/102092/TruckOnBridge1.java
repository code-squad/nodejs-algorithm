/*
https://programmers.co.kr/learn/courses/30/lessons/42583
*/

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Truck> waits = new LinkedList<>();
        Queue<Truck> moves = new LinkedList<>();

        for (int w : truck_weights) {
            waits.add(new Truck(w));
        }

        int answer = 0;
        int currentWeight = 0;

        while (!waits.isEmpty() || !moves.isEmpty()) {
            answer++;

            if (moves.isEmpty()) {
                Truck t = waits.poll();
                currentWeight += t.weight;
                moves.add(t);
                continue;
            }

            for (Truck t : moves) {
                t.forward();
            }

            if (moves.peek().move > bridge_length) {
                Truck t = moves.poll();
                currentWeight -= t.weight;
            }

            if (!waits.isEmpty() && currentWeight + waits.peek().weight <= weight) {
                Truck t = waits.poll();
                currentWeight += t.weight;
                moves.add(t);
            }
        }

        return answer;
    }
}

class Truck {
    int weight;
    int move;

    public Truck(int weight) {
        this.weight = weight;
        this.move = 1;
    }

    public void forward() {
        move++;
    }
}