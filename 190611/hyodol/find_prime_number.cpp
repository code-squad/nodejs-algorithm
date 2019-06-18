// 완전 탐색 - 순열 알고리즘으로 구현
// 소수는 에라토스테네스의 체로 미리 구한다.
// 중복되는 숫자는 set 컨테이너로 체크하기
#include <iostream>
#include <algorithm>
#include <string>
#include <vector>
#include <cmath>
#include <set>
using namespace std;

vector<bool> getPrime() {
    const int MAX = 9999999;
    vector<bool> isPrime(MAX+1, true);
    isPrime[0] = isPrime[1] = false;
    for (int i = 2; i < sqrt(MAX); i++) {
        if (!isPrime[i]) continue;
        for (int j = i*i; j <= MAX; j+=i) {
            isPrime[j] = false;
        }
    }
    return isPrime;
}

int solution(string numbers) {
    string tempNumbers = numbers;
    sort(tempNumbers.begin(), tempNumbers.end());
    vector<bool> isPrime = getPrime();
    set<int> checkPrime;
    do {
        for (int d = 1; d <= numbers.length(); d++) {
            int num = stoi(tempNumbers.substr(0, d));
            if (isPrime[num] && checkPrime.count(num) == 0) {
                checkPrime.insert(num);
            }
        }
    } while (next_permutation(tempNumbers.begin(), tempNumbers.end()));
    
    return (int)checkPrime.size();
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    cout << solution("17") << '\n';
    cout << solution("011") << '\n';
    cout << solution("012") << '\n';
    
    return 0;
}
