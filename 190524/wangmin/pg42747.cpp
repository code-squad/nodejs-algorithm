#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int solution(vector<int> citations) {
    int h;
    sort(citations.begin(),citations.end());
    for(int i = 0; i< citations.size(); i++){
        h = citations.size()-i;

        if(citations[i] >= h){
            return h;
        }

    }
    return 0;
}

