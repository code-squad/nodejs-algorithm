var lines = require('fs').readFileSync('/dev/stdin').toString().split('\n');
var arr = [];
for (var i = 0; i <= 10000; i++) {
	arr[i] = 0;
}

var n = Number(lines[0]);
for (var i = 1; i <= n; i++) {
	var x = Number(lines[i]);
	arr[x]++;
}

for (var i = 0; i <= 10000; i++) {
	if (arr[i] > 0) {
		for (var j = 0; j < arr[i]; j++) {
			console.log(i);
		}
	}
}

