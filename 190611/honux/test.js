let arr = [1,2,3,4];

function swap(arr, i, j) {
	const temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}

function all(arr, n) {
	if (n == arr.length - 1) {
		console.log(arr);
	}
	for (let i = n; i < arr.length ; i++) {
		swap(arr, n, i); 
		all(arr, n + 1);
		swap(arr, n, i); 
	}
}

all(arr, 0);
	
