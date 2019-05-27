const solution = (answers) => {
    let answer = [];
    const a = [1,2,3,4,5];
    const b = [2,1,2,3,2,4,2,5];
    const c = [3,3,1,1,2,2,4,4,5,5];
    let num = [0,0,0];
    
    answers.forEach((el, i)=>{
        if(el === a[i%5]){
            num[0] = num[0] + 1;
        }
        if(el === b[i%8]){
            num[1] = num[1] + 1;
        }
        if(el === c[i%10]){
            num[2] = num[2] + 1;
        }  
    })
    num.forEach( (el, i) => { 
        if(el === Math.max(...num)){
            answer.push(i+1)
        }
    })
    return answer
}