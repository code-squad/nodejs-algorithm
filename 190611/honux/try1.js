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

function genNum(arr, i) {
    if (i == arr.length - 1) {
        const n = Number(arr.join(""));
        console.log(n);
        if (prime[n]) count++;
        return;
    }
    for (let j = i; j < arr.length; j++) {
        swap(arr, i, j);
        genNum(arr, i + 1);
        swap(arr, i, j);
    }
}

function solution(numbers) {
    count = 0;
    let a = numbers.split("");
    console.log(a);
    genNum(a, 0);
    return count;
}
