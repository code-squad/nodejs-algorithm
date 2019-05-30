#include <bits/stdc++.h>
using namespace std;
int n, t;
int arr[999][999]{0,};

int dir[4][2] = {1, 0, 0, 1, -1, 0, 0, -1};

bool valid_location(int y, int x)
{
    return y < n && y >= 0 && x < n && x >= 0 && arr[y][x] == 0;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> n >> t;

    int num = n * n, d = 0, y = -1, x = 0, ay, ax;

    while(num > 0){
        int dy = dir[d % 4][0], dx = dir[d % 4][1];
        y += dy, x += dx;
        while(valid_location(y, x)){
            if(num == t) ay = y, ax = x;
            arr[y][x] = num--, y += dy, x += dx;
        }
        y -= dy, x -= dx;
        ++d;
    }

    for(int i=0; i<n; ++i) {
        for(int j=0; j<n; ++j) cout << arr[i][j] << " ";
        cout << "\n";
    }
    cout << ay + 1 << " " << ax + 1;

    return 0;
}
