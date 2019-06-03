import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int way1[] = new int[]{1, 2, 3, 4, 5};
        int way2[] = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int way3[] = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int cnt[] = new int[3];
        int max = 0;
        int result[];
		List<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<answers.length; i++){
            if(way1[i%way1.length] == answers[i]){
                cnt[0]++;
            }
            if(way2[i%way2.length] == answers[i]){
                cnt[1]++;
            }
            if(way3[i%way3.length] == answers[i]){
                cnt[2]++;
            }
        }
        
        max = cnt[0];
        if(max < cnt[1]){
            max = cnt[1];
        }
        if(max < cnt[2]){
            max = cnt[2];
        }
        
        for(int i=0; i<cnt.length; i++){
            if(max == cnt[i]){
                answer.add(i+1);
            }
        }
        
        result = new int[answer.size()];
        for(int i=0; i<answer.size(); i++){
            result[i] = answer.get(i);
        }
        
        return result;
    }
}