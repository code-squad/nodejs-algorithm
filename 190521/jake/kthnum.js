function solution(array, commands) {
    var answer = [];
    return commands.reduce((a, e) => {
        var begin = e[0]-1, end = e[1], target = e[2]-1;
        a.push(array.slice(begin, end)
                    .sort((a, b) => a - b)
                    .filter((t, i) => i === target )
                    .reduce((a, t) => a+t, 0));
        return a;
    }, []);
}
