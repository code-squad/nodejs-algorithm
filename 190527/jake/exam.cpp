#include <bits/stdc++.h>
using namespace std;
int student2[8]{2,1,2,3,2,4,2,5};
int student3[10]{3,3,1,1,2,2,4,4,5,5};
vector<int> solution(vector<int> answers) {
    vector<int> answer(3, 0);
    for(int i=0; i<answers.size(); ++i){
        int a = answers[i];
        if((i % 5) + 1 == a) answer[0]++;
        if(student2[i % 8] == a) answer[1]++;
        if(student3[i % 10] == a) answer[2]++;
    }
    
    int high_score = max(answer[0], max(answer[1], answer[2]));
           
    vector<int> ret;
    for(int i=0; i<answer.size(); ++i){
        if(answer[i] == high_score) ret.push_back(i+1);
    }
    
    return ret;
}
