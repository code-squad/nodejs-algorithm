#include <bits/stdc++.h>
using namespace std;
int N;
int store[10001] {0,};
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cin >> N;
    int t;
    while(N--){
        cin >> t;
        store[t]++;
    }
    for(int i = 1; i < 10001; ++i){
        while(store[i]--){
            cout << i << "\n";
        }
    }
    return 0;
}

