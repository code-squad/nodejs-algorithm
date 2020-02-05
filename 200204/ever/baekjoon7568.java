/*
백준 7568번 - 덩치
매우 어려웠다.
인터넷에서 찾아보니 이렇게 쉬운 방법이 있었다.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] person = new int[N][3];

        for (int index = 0; index < N; index++) {
            person[index][0] = scanner.nextInt();   //몸무게
            person[index][1] = scanner.nextInt();   //키
            person[index][2] = 1;   //등수
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(person[i][0]>person[j][0] && person[i][1]>person[j][1]){
                    person[j][2]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(person[i][2] + " ");
        }
    }
}