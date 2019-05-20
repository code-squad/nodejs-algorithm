#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

string solution(vector<string> participant, vector<string> completion) {
    unordered_map<string, int> um;
    for (string name : completion) {
        if (um.find(name) == um.end()) um[name] = 1;
        else um[name]++;
    }
    
    string answer = "";
    for (string name : participant) {
        if (um.find(name) == um.end()) {
            answer = name;
            break;
        } else {
            um[name]--;
            if (um[name] < 0) {
                answer = name;
                break;
            }
        }
    }
    
    return answer;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    vector<string> participant1 = {"leo", "kiki", "eden"};
    vector<string> participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
    vector<string> participant3 = {"mislav", "stanko", "mislav", "ana"};
    
    vector<string> completion1 = {"eden", "kiki"};
    vector<string> completion2 = {"josipa", "filipa", "marina", "nikola"};
    vector<string> completion3 = {"stanko", "anan", "mislav"};
    
    cout << solution(participant1, completion1) << '\n';
    cout << solution(participant2, completion2) << '\n';
    cout << solution(participant3, completion3) << '\n';
    
    return 0;
}
