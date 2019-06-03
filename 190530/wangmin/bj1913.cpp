//https://www.acmicpc.net/problem/1913

#include <iostream>
#include <vector>

using namespace std;

int main () {
    int n,a;
    cin >> n >> a;

    vector<vector<int>> vec = vector<vector<int>>(n,(vector<int>(n,0)));

    vector<int> start ={n/2,n/2};
    vector<vector<int>> right = {{-1,0},{0,1},{1,0},{0,-1}};
    vector<int> head = {-1,0};

    vector<int> aindex = {0,0};

    // vec[start[0]][start[1]] = 1;
    int rightindex = 0;
    for(int i = 1; i <= n*n; i ++){
        // vec[start[0],start[1]]
        vec[start[0]][start[1]] = i;

        if(i == a){
            aindex = {start[0],start[1]};
        }

        if(vec[start[0]+right[rightindex%4][0]][start[1]+right[rightindex%4][1]] == 0){
            head = right[rightindex%4];
            start[0] = start[0]+head[0];
            start[1] = start[1]+head[1];
            rightindex++;
        }else{
            start[0] = start[0]+head[0];
            start[1] = start[1]+head[1];
        }
    }

    for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            cout << vec[i][j]<<" ";
        }
        cout << "\n";
    }

    cout << aindex[0]+1 << " " << aindex[1]+1<<endl;




}