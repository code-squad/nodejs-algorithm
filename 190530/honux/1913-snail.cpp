#include <stdio.h>
#include <iostream>
#include <algorithm>
#include <vector>
#include <map>

using namespace std;
int dr[] = { -1, 0, 1, 0 };
int dc[] = { 0, 1, 0, -1 };


int main() {
	int n;
	scanf("%d", &n);
	vector <vector <int>> m(n);
	map<int, pair<int, int>> nmap;
	for (int i = 0; i < n; i++) {
		m[i].resize(n);
	}

	int num = 1;
	int row = n / 2;
	int col = row;
	double w = 1;
	m[row][col] = num;
	int vec = 0;

	bool loop = true;
	while (loop) {
		for (int i = 0; i < (int) w; i++) {
			num++;
			if (num > n * n) {
				loop = false;
				break;
			}
			row += dr[vec];
			col += dc[vec];
			m[row][col] = num;
			nmap[num] = make_pair(row + 1, col + 1);
		}
		vec = (vec + 1) % 4;
		w += 0.5;
	}

	for (auto v : m) {
		for (auto n : v) {
			printf("%d ", n);
		}
		printf("\n");
	}

	int x;
	scanf("%d", &x);
	printf("%d %d\n", nmap[x].first, nmap[x].second);
	return 0;
}
