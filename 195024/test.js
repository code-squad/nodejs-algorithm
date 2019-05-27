// Version 1
function solution(citations) {
  let array = new Array(citations.length).fill(0);
  let sortedArr = citations.sort((a, b) => b - a);
  let answer;

  for(let i = 0; i < citations.length; i++) {
      for(let j = 0; j < citations.length; j++) {
        if(sortedArr[j] <= sortedArr[i]) {
              array[(citations.length - 1) - i]++;
          }  
      }
  }

  sortedArr.some((val) => {
      if(array[sortedArr.indexOf(val)] >= val) {
          answer = val;
          return true;
      }
  })

  return answer
}

// Version 2
function solution(citation) {
let array = [];
let sortedArr = citation.sort((a, b) => a - b);
let answer;

for(let i = citation.length; i > 0; i--) {
    array.push(i);
}

sortedArr.some((val, index) => {

    if(val >= array[index]) {
        answer = array[index];
        return true;
    }
})

return answer === undefined ? 0 : answer;
}