function solution(numbers) {
   const ret = numbers.sort((a, b) => {
        const s1 = a.toString();
        const s2 = b.toString();
        if ((s1 + s2) < (s2 + s1)) {
            return 1;
        } else {
            return -1;
        }
    }).map((n)=>(n.toString()))
    .reduce((a, b) => (a + b));
    
    if (ret[0] === '0') return '0';
    return ret;
    }
}
