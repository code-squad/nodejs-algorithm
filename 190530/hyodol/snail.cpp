// BOJ 1913 - 달팽이
#include <iostream>
#include <vector>
using namespace std;

const int dy[] = {-1, 0, 1, 0};
const int dx[] = {0, 1, 0, -1};

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    int n;
    cin >> n;
    vector<vector<int> > arr(n, vector<int>(n));
    
    int value;
    cin >> value;
    
    int num = 1;
    int dir = 0;
    int y = n / 2;
    int x = n / 2;
    while (!(y == 0 && x == 0)) {
        arr[y][x] = num++;
        int ny = y + dy[dir % 4];
        int nx = x + dx[dir % 4];
        if (ny < 0 || ny >= n || nx < 0 || nx >= n) dir++;
        if (arr[ny][nx] == 0) {
            y = ny;
            x = nx;
            dir++;
        } else {
            dir--;
            num--;
        }
    }
    arr[y][x] = num;
    
    int findY = 0, findX = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (value == arr[i][j]) {
                findY = i+1;
                findX = j+1;
            }
            cout << arr[i][j] << " ";
        }
        cout << '\n';
    }
    
    cout << findY << " " << findX << '\n';
    return 0;
}
