package dailyAlgo;

import java.util.*;

public class Programmers42746 {

	public String solution(int[] numbers) {
		String answer = "";
		String[] strArr = new String[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			strArr[i] = Integer.toString(numbers[i]);
		}

		Arrays.sort(strArr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (Integer.parseInt(o1 + o2) > Integer.parseInt(o2 + o1)) {
					return -1;
				}
				return 1;
			}
		});

		if (strArr[0].equals("0")) {
			return "0";
		}

		for (String temp : strArr) {
			answer += temp;
		}

		return answer;
	}

}
