/*
���� 7568�� - ��ġ
�ſ� �������.
���ͳݿ��� ã�ƺ��� �̷��� ���� ����� �־���.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] person = new int[N][3];

        for (int index = 0; index < N; index++) {
            person[index][0] = scanner.nextInt();   //������
            person[index][1] = scanner.nextInt();   //Ű
            person[index][2] = 1;   //���
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