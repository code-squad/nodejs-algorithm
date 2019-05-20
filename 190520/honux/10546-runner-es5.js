function _toArray(arr) { return Array.isArray(arr) ? arr : Array.from(arr); }

var lines = require('fs').readFileSync('/dev/stdin').toString().split('\n');

var _lines = _toArray(lines);

var ns = _lines[0];

var names = _lines.slice(1);

var n = Number(ns);

d = {};

for (var i = 0; i < n; i++) {
	var name = names[i];
	if (name in d) {
		d[name]++;
	} else {
		d[name] = 1;
	}
}

for (var _i = n; _i < 2 * n - 1; _i++) {
	var _name = names[_i];
	d[_name]--;
	if (d[_name] == 0) {
		delete d[_name];
	}
}

console.log(Object.keys(d)[0]);