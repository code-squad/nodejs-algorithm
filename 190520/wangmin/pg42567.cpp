// https://programmers.co.kr/learn/courses/30/lessons/42576

#include <string>
#include <algorithm>
#include <vector>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    sort(participant.begin(),participant.end());
    sort(completion.begin(),completion.end());
    
    // string answer = "";
    
    for(int i = 0; i < participant.size(); i++){
        if(participant[i] != completion[i]){
            return participant[i];
        }
    }
    
    // return answer;
}