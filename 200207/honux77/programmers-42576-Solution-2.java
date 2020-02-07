// 정렬 사용해서 다시 풀었음
import java.util.Arrays;

public class Solution {

        public String solution(String[] participant, String[] completion) {
            Arrays.sort(participant);
            Arrays.sort(completion);
            
            int i;
            for (i = 0; i < completion.length; i++) {
                if (!participant[i].equals(completion[i])) {
                    return participant[i];
                }
            }
            return participant[i];
        }
}