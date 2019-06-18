const prime = []
const maxn = 9999999;
let count = 0;

for (let i = 0; i <= maxn; i++) {
    prime.push(true);
}
prime[0] = prime[1] = false;

for (let i = 2; i<= maxn; i++) {
    if(!prime[i]) continue;
    for (let j = i * 2;  j <= maxn; j += i) {
        prime[j] = false;
    }
}

function swap(arr, i, j) {
    const temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

function perm(arr, k, j = 0) {
	if (j === k){
		const n = Number(arr.slice(0, j).join(""));
		console.log(n);
		//count only once
		if (prime[n]) {
			count++;
			prime[n] = false;
		}
		return;
	}
	for (let i = j; i < arr.length; i++) {
		swap(arr, i, j);
		perm(arr, k, j + 1);
		swap(arr, i, j);
	}
}

function solution(numbers) {
    count = 0;
    let a = numbers.split("");
	for (let i = 1; i <= numbers.length; i++) {
    	perm(a, i);
	}
    return count;
}

console.log(solution("17"));
