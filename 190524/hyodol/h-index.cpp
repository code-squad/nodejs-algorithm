// 풀기전에 h-index를 이해하고 있어야 한다.
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int solution(vector<int> citations) {
    sort(citations.begin(), citations.end(), greater<int>());
    for (int i = 0; i < citations.size(); i++) {
        if (citations[i] <= i) return i;
    }
    return (int)citations.size();
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    cout << solution({3, 0, 6, 1, 5}) << '\n';
    cout << solution({1, 7, 0, 1, 6, 4}) << '\n';
    cout << solution({1545, 2, 999, 790, 540, 10, 22}) << '\n';
    cout << solution({100, 70, 35, 50, 125}) << '\n';
    cout << solution({0}) << '\n';
    cout << solution({7}) << '\n';
    
    return 0;
}
