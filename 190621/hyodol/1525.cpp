// BOJ 1525 - 퍼즐
#include <iostream>
#include <unordered_map>
#include <string>
#include <queue>
using namespace std;
const int dy[] = {-1, 1, 0, 0};
const int dx[] = {0, 0, -1, 1};

int bfs(int start) {
    unordered_map<int, int> um;
    queue<int> q;
    
    um[start] = 0;
    q.push(start);
    
    while (!q.empty()) {
        int current = q.front();
        q.pop();
        
        if (current == 123456789)
            return um[current];
        
        string strCurrent = to_string(current);
        int index = (int)strCurrent.find('9');
        int cy = index / 3, cx = index % 3;
        
        for (int d = 0; d < 4; d++) {
            int ny = cy + dy[d];
            int nx = cx + dx[d];
            if (ny < 0 || ny >= 3 || nx < 0 || nx >= 3)
                continue;
            
            string strNext = strCurrent;
            swap(strNext[cy * 3 + cx], strNext[ny * 3 + nx]);
            int next = stoi(strNext);
            if (um.count(next) == 0) {
                um[next] = um[current] + 1;
                q.push(next);
            }
        }
    }
    
    return -1;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    int start = 0;
    for (int y = 0; y < 3; y++) {
        for (int x = 0; x < 3; x++) {
            int num;
            cin >> num;
            if (num == 0) num = 9;
            start = start * 10 + num;
        }
    }
    
    cout << bfs(start) << '\n';
    return 0;
}
