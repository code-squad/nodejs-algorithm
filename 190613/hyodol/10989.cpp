// BOJ 10989 - 수 정렬하기 3
// Counting Sort
#include <iostream>
#include <vector>
#include <cmath>
using namespace std;
const int MAX = 10000;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    int n;
    cin >> n;
    
    vector<int> count(MAX+1);
    for (int i = 0; i < n; i++) {
        int num;
        cin >> num;
        count[num]++;
    }
    
    for (int num = 0; num <= MAX; num++) {
        if (count[num] == 0) continue;
        while (count[num]--) cout << num << '\n';
    }
    
    return 0;
}
