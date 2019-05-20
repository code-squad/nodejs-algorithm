#include <bits/stdc++.h>
using namespace std;
unordered_set<string> dic;

void update_dic(vector<string>& v)
{
    for(string e : v){
        auto iter = dic.find(e);
        if(iter == dic.end()){
            dic.insert(e);
        } else {
            dic.erase(iter);
        }
    }   
}

string solution(vector<string> participant, vector<string> completion) {
    update_dic(participant);
    update_dic(completion);
    return *(dic.begin());
}
