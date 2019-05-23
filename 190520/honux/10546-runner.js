const lines = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const n = Number(lines[0]);
const p1 = lines.slice(1, n + 1);
const p2 = lines.slice(n + 1);

m = {};

for (let p of p1) {
	if (p in m) {
		m[p]++;
	} else {
		m[p] = 1;
	}
}

for (let p of p2) {
	m[p]--;
	if (m[p] == 0) delete m[p];
}

console.log(Object.keys(m)[0]);

