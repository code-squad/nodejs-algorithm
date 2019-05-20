const lines = require('fs').readFileSync('/dev/stdin').toString().split('\n');
const [ns, ...names] = lines;
const n = Number(ns);

d = {};

for (let i = 0; i < n; i++) {
	const name = names[i];
	if (name in d) {
		d[name]++;
	} else {
		d[name] = 1;
	}
}

for (let i = n; i < 2 * n - 1; i++) {
	const name = names[i];
	d[name]--;
	if (d[name] == 0) {
		delete d[name];
	}
}

console.log(Object.keys(d)[0]);

