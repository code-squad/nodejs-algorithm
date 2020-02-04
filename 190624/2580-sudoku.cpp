#include <iostream>
#include <map>

int b[9][9];

using namespace std;

vector<int> findNums(int i,int j) {
	//map <int, bool> nums;
	//checkv(i, nums);
	//checkh(j, nums);
	//checkbox(i,j, nums);
}

bool find = false;

void fillNums(int i, int j) {
	if (find) return;
	if (i == 9 && j == 9 && b[i][j] != 0) {
		find = true;
		return;
	}

	int jn = j < 9 ? j + 1: j;
	int in = jn == j && i < 9; i + 1: i;

	if (b[i][j] == 0) {
		vector <int> nums = findNums(i,j);
		if (nums.size() == 0) return;
		for (auto n: nums) {
			board[i][j] = n;
			fillNums(in, jn);
		}
	}
	return;
}

int main() {
	char c;
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
			cin >> c;
			b[i][j] = c - '0';
		}
	}
	fillNums(0,0);
	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
			cout << b[i][j] << " ";
		}
		cout << "\n";
	}
	return 0;
}
