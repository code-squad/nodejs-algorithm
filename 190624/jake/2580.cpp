#include <bits/stdc++.h>
using namespace std;

bool solved = false;
int board[9][9], answer[9][9];
bool row[9][10]{0,}, col[9][10]{0,}, block[9][10]{0,};

void get_next(int& y, int& x) {
  for(int i=0; i<9; ++i){
    for(int j=0; j<9; ++j){
      if(!board[i][j]){
        y = i, x = j;
        return;
      }
    }
  }
}

bool check_possible(int y, int x, int v){
  return !col[y][v] && !row[x][v] && !block[(y/3)*3+(x/3)][v];
}

void set_boolean(int y, int x, int v, bool set_or_unset) {
  col[y][v] = row[x][v] = block[(y/3)*3+(x/3)][v] = set_or_unset;
}

void solve() {
  if(solved) return;
  int y = -1, x = -1;
  get_next(y, x);

  if(y == -1){
    for(int i=0; i<9; ++i){
      for(int j=0; j<9; ++j){
        answer[i][j] = board[i][j];
      }
    }
    solved = true;
    return;
  }

  for(int v=1; v<10; ++v) {
    if(check_possible(y, x, v)){
      set_boolean(y, x, v, true);
      board[y][x] = v;
      solve();
      board[y][x] = 0;
      set_boolean(y, x, v, false);
    }
  }
}

int main()
{
  ios_base::sync_with_stdio(false);
  cin.tie(NULL);

  for(int i=0; i<9; ++i){
    for(int j=0; j<9; ++j){
      cin >> board[i][j];
      set_boolean(i, j, board[i][j], true);
    }
  }

  solve();

  for(int i=0; i<9; ++i){
    for(int j=0; j<9; ++j){
      cout << answer[i][j] << " ";
    }
    cout << "\n";
  }

  return 0;
}
