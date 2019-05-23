function solution(array, commands) {
    return commands.map(com => {
        const [i, j, k] = com;
        return array.slice(i - 1, j).sort((a, b) => (a -b))[k - 1];
        
    });
}
