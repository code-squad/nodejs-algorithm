const solution = (arr, commands) => {
    let answer = commands.map( el => arr.slice(el[0]-1,el[1]).sort(sortFuc)[el[2]-1])
    return answer;
}

const sortFuc = (a,b) => {return a-b};