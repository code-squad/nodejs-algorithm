// 첫번째
function solution(citations) {
    var answer = 0;
    while (true) {
        if (citations.filter(x => { return x > answer }).length > answer) {
            answer += 1;
            continue;
        }
        break;
    }
    return Math.max.apply(null, citations) === 0 ? 0 : answer;
}

// 두번째

function solution(citations) {
    citations.sort((a, b) => b - a).unshift(0);
    for (var i = citations.length - 1; i >= 0; i--) {
        if (citations[i] >= i) return i;
    }
}

// 세번째

function solution(citations) {
    citations = citations.sort((a, b) => a - b);
    while (true) {
        if (citations.findIndex(x => x < citations.length) !== -1) {
            citations.shift();
        } else {
            return citations.length;
        }
    }
}