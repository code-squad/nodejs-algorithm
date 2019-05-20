package dailyAlgo;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> hash = new HashMap<>();

		for (String name : participant) {
			if (hash.containsKey(name)) {
				hash.put(name, hash.get(name) + 1);
			} else {
				hash.put(name, 1);
			}
		}

		for (String name : completion) {
			hash.put(name, hash.get(name) - 1);
		}

		for (String name : participant) {
			if (hash.get(name) > 0) {
				answer = name;
			}
		}

		return answer;
	}
}