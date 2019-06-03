function solution(answers) {
    let answer = [];
    let supo1 = [1,2,3,4,5];
    let supo2 = [2,1,2,3,2,4,2,5];
    let supo3 = [3,3,1,1,2,2,4,4,5,5];
    let ans1 = howManyCorrect(answers , supo1);
    let ans2 = howManyCorrect(answers , supo2);
    let ans3 = howManyCorrect(answers , supo3);
    let max = Math.max(ans1,ans2,ans3);
    if( max === ans1) answer.push(1);
    if( max === ans2) answer.push(2);
    if( max === ans3) answer.push(3);

    return answer;
}

function howManyCorrect(ans , supo) {
    return ans.filter(function(v, i){
        return v === supo[i % supo.length];
    }).length
}
