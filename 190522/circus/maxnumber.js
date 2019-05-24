function solution(numbers) {
    var result = numbers.toString().split(',').sort((a, b) => {
        return (b + a) - (a + b);
    }).join('');

    return result[0] === '0' ? '0' : result;
}
