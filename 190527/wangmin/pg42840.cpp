#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> one = {1,2,3,4,5};
    vector<int> two = {2,1,2,3,2,4,2,5};
    vector<int> three = {3,3,1,1,2,2,4,4,5,5};
    
    int oneCount = 0;
    int twoCount = 0;
    int threeCount = 0;

    for(int i = 0; i < answers.size(); i++){
        if(answers[i] == one[i%one.size()]){
            oneCount++;
        }
    }

    int max = oneCount;

    for(int i = 0; i < answers.size(); i++){
        if(answers[i] == two[i%two.size()]){
            twoCount++;
        }
    }

    max = (twoCount > max) ? twoCount : max;

    for(int i = 0; i < answers.size(); i++){
        if(answers[i] == three[i%three.size()]){
            threeCount++;
        }
    }
    
    max = (threeCount > max) ? threeCount : max;
    
    
    
    vector<int> answer;
    if(max == oneCount) answer.push_back(1);
    if(max == twoCount) answer.push_back(2);
    if(max == threeCount) answer.push_back(3);


    return answer;
}