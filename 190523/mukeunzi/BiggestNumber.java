import java.util.Arrays;
import java.util.Comparator;

public class BiggestNumber {
	public String solution(int[] numbers) {
		String[] strNumbers = new String[numbers.length];
		String result = "";
		
		for(int i=0; i<strNumbers.length; i++){
			strNumbers[i] = Integer.toString(numbers[i]);
		}
		
		Arrays.sort(strNumbers, new Comparator<String>(){
			@Override
			public int compare(String a, String b){
				String threeA = a + a + a;
				String threeB = b + b + b;
				
				return threeB.compareTo(threeA);
			}
		});
		
		for(int i=0; i<strNumbers.length; i++){
			result += strNumbers[i];
		}
		
		if(result.charAt(0) == '0'){
			return "0";
		}
		return result;
	}
}
