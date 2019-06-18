#include <vector>
#include <iostream>

using namespace std;

int main(){
    cin.tie(NULL);
    cout.tie(NULL);
    ios_base :: sync_with_stdio(false);
    
    int N;
    cin >> N;
    int a;
    vector<int> count(10001, 0);
    

    for(int i = 0; i < N; i++){
        cin >> a;
        count[a]++;
    }

    for(int i = 0; i <= 10001; i++){
        for(int j = count[i]; j > 0; j--){
            cout << i << "\n";
        }
    }


    return 0;
}


