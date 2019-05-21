function solution(participant, completion) {
	const map = {};
    for (let p of participant) {
        if (p in map) {
            map[p]++;
        } else {
            map[p] = 1;
        }
    }
    for (let p of completion) {
        map[p]--;
        if (map[p] == 0) delete map[p];
    }
    return Object.keys(map)[0];
}
