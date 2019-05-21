package dailyAlgo;

import java.util.Arrays;

public class Programmers42748 {

	public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];
    	int answerIndex = 0;
    	
    	for (int[] arr : commands) {
    		int[] temp = new int[arr[1]-arr[0] + 1];
    		int count = 0;
    		
    		for (int i=arr[0]-1; i<arr[1]; i++) {
    			temp[count++] = array[i];
    		}
    		Arrays.sort(temp);
    		answer[answerIndex++] = temp[arr[2]-1];
    	}
    	
    	return answer;
	}

}
