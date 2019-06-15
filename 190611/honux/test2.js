function swap(arr, i, j) {
	const temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

function perm(arr, k, j = 0) {
	if (j === k){
		console.log(arr.slice(0,j));
		return;
	}
	for (let i = j; i < arr.length; i++) {
		swap(arr, i, j);
		perm(arr, k, j + 1);
		swap(arr, i, j);
	}
}

arr = [1, 2, 3];
perm(arr, 1);
console.log("==========");
perm(arr, 2);
