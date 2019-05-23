import java.util.Arrays;

public class KNumber {
	
    public int[] solution(int[] array, int[][] commands) {
		int result[] = new int[commands.length];
		int temp[];
		
		for(int i=0; i<commands.length; i++){
			temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(temp);
			result[i] = temp[commands[i][2]-1];
		}
		
		return result;
	}

}
