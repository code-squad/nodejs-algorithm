#include <vector>
#include <iostream>
#include <map>
#include <queue>

using namespace std;

int find9(int number){
    int result = 0;
    int c;
    int i = 0;
    while(!result){
        c = number%10;
        if(c == 9){
            result = 9-i;
            return result;
        }
        number = number/10;
        i++;
    }
    return result;
}

vector<int> makeVec(int number){
    vector<int> result(0);
    int c;
    int n = 100000000;
    for(int i = 0; i < 9 ; i++){
        c = number/n%10;
        result.push_back(c);
        n = n/10;
    }

    return result;
}

int makeNumber(vector<int> vec){
    int result = 0;
    int n = 100000000;
    for(int i = 0; i < 9; i++){
        result += vec[i]*n;
        n = n/10;
    }
    return result;
}

vector<int> swapVec(vector<int> vec, int a, int b){
    int c = vec[a-1];
    vec[a-1] = vec[b-1];
    vec[b-1] = c;

    return vec;
}

int find9(vector<int> vec){
    for(int i = 0 ; i < 9; i++){
        if(vec[i] == 9) {
            return i+1;
        }
    }
}

int main(){
    int start;
    int number = 0;
    int n = 100000000;
    int c;

    vector<int> vec(0);
    map<int,bool> m;
    queue<vector<vector<int>>> q ;
    vector<vector<int>> map(10,vector<int>(0));
    map[1] = {2,4};
    map[2] = {1,3,5};
    map[3] = {2,6};
    map[4] = {1,5,7};
    map[5] = {2,4,6,8};
    map[6] = {3,5,9};
    map[7] = {4,8};
    map[8] = {5,7,9};
    map[9] = {6,8};


    for(int i = 0 ; i < 9; i++){
        cin >> c;
        if(c== 0) {
            c = 9;
        }
        vec.push_back(c);
        number  += c*n;
        n = n/10;
    }

    m[number] = true;


    q.push({vec,{0}});
    vector<int> curVec;
    int curNum;
    int count;
    int result = -1;
    int cur9;
    int next9;
    vector<int> nextVec;
    int nextNum;
    while(!q.empty()){
        curVec = q.front()[0];
        count = q.front()[1][0];
        curNum = makeNumber(curVec);
        cur9 = find9(curNum);
        q.pop();

        if(curNum == 123456789){
            result = count;
            break;
        }

        for(int i = 0; i < map[cur9].size(); i++){
            nextVec = swapVec(curVec,cur9,map[cur9][i]);
            nextNum = makeNumber(nextVec);

            if(m[nextNum] != true){
                m[nextNum] = true;
                q.push({nextVec,{count+1}});
            }
        }
    }

    cout << result <<endl;

    return 0;
}