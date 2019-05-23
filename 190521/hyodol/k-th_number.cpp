#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

vector<int> solution(vector<int> array, vector<vector<int> > commands) {
    vector<int> answer;
    
    for (int i = 0; i < commands.size(); i++) {
        vector<int> tempArray = array;
        sort(tempArray.begin() + commands[i][0] - 1, tempArray.begin() + commands[i][1]);
        answer.push_back(tempArray[commands[i][0] + commands[i][2] - 2]);
    }
    
    return answer;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    vector<int> array = {1, 5, 2, 6, 3, 7, 4};
    vector<vector<int> > commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
    vector<int> answer = solution(array, commands);
    for (int num : answer) cout << num << " ";
    cout << '\n';
    
    return 0;
}

