#include <string>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer(0);
    vector<int> arr;
    for(int i = 0; i < commands.size(); i++){
        int a = commands[i][0];
        int b = commands[i][1];
        int c = commands[i][2];
        
        arr = vector<int>(array.begin()+a-1, array.begin()+b);
        sort(arr.begin(),arr.end());
        answer.push_back(arr[c-1]);
    }

    return answer;
}