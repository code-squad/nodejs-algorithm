function solution(citations) {
    citations.sort((a,b) => (b - a));
    let i = 0;
    while (i + 1 <= citations[i]) i++;
    return i;          
}
