const solution = (c) => {
    c.sort((a,b)=>b-a);
    for(let i=0; i<c.length; i++){
        if(i+1 > c[i]){
            return i
        }else if(i+1 === c[i]){
            return c[i]
        }
    }
    return c.length
}

console.log(solution([1,1,3,4,8]))