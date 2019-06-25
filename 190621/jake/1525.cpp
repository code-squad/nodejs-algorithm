#include <bits/stdc++.h>>
using namespace std;

unordered_set<string> visited;
string target = "123456780";
int delta[4][2] {0, -1, -1, 0, 0, 1, 1, 0};

void state_to_arr(char arr[3][3], string& state){
  for(int i=0; i<3; ++i){
    for(int j=0; j<3; ++j){
      arr[i][j] = state[i*3+j];
    }
  }
}

string arr_to_state(char arr[3][3]) {
  string ret = "";
  for(int i=0; i<3; ++i){
    for(int j=0; j<3; ++j){
      ret += arr[i][j];
    }
  }
  return ret;
}

bool is_valid(int y, int x){
  return y >= 0 && y < 3 && x >= 0 && x < 3;
}

int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

  string start = "";
  char t;
  for(int i=0; i<9; ++i){
    cin >> t;
    start += t;
  }

  queue<pair<string, int>> q;
  q.push(make_pair(start, 0));
  int answer = -1;

  while(q.size()){
    auto cur = q.front();
    q.pop();
    auto& state = cur.first;

    if(visited.find(state) != visited.end()) {
      continue;
    }
    if(state == target){
      answer = cur.second;
      break;
    }
    visited.insert(cur.first);

    int idx;
    for(int i=0; i<9; ++i){
      if(state[i] == '0'){
        idx = i;
        break;
      }
    }

    int y = idx / 3, x = idx % 3;
    char arr[3][3];
    state_to_arr(arr, state);
    for(int i=0; i<4; ++i){
      int next_y = y + delta[i][0], next_x = x + delta[i][1];
      if(is_valid(next_y, next_x)){
        swap(arr[next_y][next_x], arr[y][x]);
        q.push(make_pair(arr_to_state(arr), cur.second + 1));
        swap(arr[next_y][next_x], arr[y][x]);
      }
    }
  }

  cout << answer;

  return 0;
}
