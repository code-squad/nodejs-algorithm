import java.util.*;

public class NotFinishedPlayer {
	
    public String solution(String[] participant, String[] completion) {
		Map<String, Integer> player = new HashMap<>();
		String result = "";
		
		for(int i=0; i<participant.length; i++){
			if(player.containsKey(participant[i])){
				player.put(participant[i], player.get(participant[i]) + 1);
			}else{
				player.put(participant[i], 1);
			}
		}
		
		for(int i=0; i<completion.length; i++){
			player.put(completion[i], player.get(completion[i]) - 1); 
		}
		
		for(int i=0; i<participant.length; i++){
			if(player.get(participant[i]) > 0){
				result = participant[i];
			}
		}
		return result;
	}

}
