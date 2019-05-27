function solution(answers) {
    var answer = [];
    const first = [1,2,3,4,5]; // 5
    const second = [2,1,2,3,2,4,2,5]; // 8
    const third = [3,3,1,1,2,2,4,4,5,5]; // 10
    
    let firstCount = 0;
    let secondCount = 0;
    let thirdCount = 0;
    
    answers.forEach((val, index) => {
        
        const firstIndex = ((index % 5));
        const secondIndex = ((index % 8));        
        const thirdIndex = (index % 10); 
        
        if (val === first[firstIndex]) {
            firstCount++;
        }
        if (val === second[secondIndex]) {
            secondCount++;
        }
        if (val === third[thirdIndex]) {
            thirdCount++;
        }
    })
    
    const answerArr = {1 :firstCount, 2:secondCount, 3:thirdCount};
    
    let temp = answerArr['1']
    console.log(temp)
    
    Object.keys(answerArr).forEach((key) => {
        if (answerArr[key] === temp) {
            answer.push(key*1)
        } else if (answerArr[key] > temp) {
            temp = answerArr[key];
            answer = [];
            answer.push(key*1);
        }
    })

    return answer;
}