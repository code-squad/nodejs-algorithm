#include <iostream>
#include <vector>
using namespace std;

vector<int> solution(vector<int> answers) {
    vector<vector<int> > patterns(3);
    patterns[0] = {1, 2, 3, 4, 5};
    patterns[1] = {2, 1, 2, 3, 2, 4, 2, 5};
    patterns[2] = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    int maxCnt = 0;
    vector<int> personCnt(3);
    for (int i = 0; i < 3; i++) {
        int cnt = 0;
        int patternsSize = (int)patterns[i].size();
        for (int j = 0; j < answers.size(); j++) {
            if (answers[j] == patterns[i][j % patternsSize]) cnt++;
        }
        personCnt[i] = cnt;
        maxCnt = max(maxCnt, cnt);
    }
    
    vector<int> result;
    for (int i = 0; i < 3; i++) {
        if (maxCnt == personCnt[i]) result.push_back(i+1);
    }
    return result;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    vector<int> result1 = solution({1, 2, 3, 4, 5});
    for (int num : result1) cout << num << " ";
    cout << '\n';
    
    vector<int> result2 = solution({1, 3, 2, 4, 2});
    for (int num : result2) cout << num << " ";
    cout << '\n';
    
    return 0;
}
