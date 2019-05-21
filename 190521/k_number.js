const solution = (arr, commands) => {
<<<<<<< HEAD
    let answer = commands.map( el => arr.slice(el[0]-1,el[1]).sort(sortFuc)[el[2]-1])
=======
    const answer = [];
    const first = commands.map( el => el[0]-1 );
    const second = commands.map( el => el[1] );
    const third = commands.map( el => el[2]-1 );
    for ( let i = 0; i <  first.length; i++ ){
        answer.push(arr.slice(first[i],second[i]).sort(sortFuc)[third[i]]);
    }
>>>>>>> k번째 수 문제풀이
    return answer;
}

const sortFuc = (a,b) => {return a-b};