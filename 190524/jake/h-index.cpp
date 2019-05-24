#include <bits/stdc++.h>
using namespace std;

int solution(vector<int> citations) {
    sort(citations.begin(), citations.end());
    
    for(int i = 10000; i >= 0; --i){
        auto iter = upper_bound(citations.begin(), citations.end(), i); // i보다 큰 원소의 첫 위치
        auto iter2 = lower_bound(citations.begin(), citations.end(), i); // i보다 같거나 큰 원소의 첫 위치
        if(distance(citations.begin(), iter) <= i &&
           distance(iter2, citations.end()) >= i) return i;
    }
    
    return 0;
}
