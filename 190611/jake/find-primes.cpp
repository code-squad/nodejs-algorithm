#include <bits/stdc++.h>
using namespace std;
unordered_set<int> used;
vector<bool> picked;

bool check_prime(const int n)
{
    if(n == 2) return true;
    if(n == 1 || n % 2 == 0) return false;
    
    int sqrt_root = 1;
    while(sqrt_root * sqrt_root < n * n)
        ++sqrt_root;
    
    for(int i=2; i<sqrt_root; ++i)
        if(n % i == 0) return false;
    
    return true;
}    

int check_all_numbers(const vector<int>& digits, int number, int len)
{
    if(len == digits.size()) return 0;
    
    int ret = 0;
    for(int i=0; i<digits.size(); ++i){
        if(picked[i]) continue;
        
        int next_num = number * 10 + digits[i];
        if(used.find(next_num) == used.end()) {
            used.insert(next_num);
            ret += check_prime(next_num) ? 1 : 0;
        }
        
        picked[i] = true;
        ret += check_all_numbers(digits, next_num, len+1);
        picked[i] = false;
    }
    
    return ret;
}

int solution(string numbers) {
    vector<int> digits;
    for(char c : numbers) digits.push_back(c - '0');
    picked = vector<bool>(digits.size(), false);
    
    return check_all_numbers(digits, 0, 0);
}
