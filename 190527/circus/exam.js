function solution(answers) {
    var num1 = [1, 2, 3, 4, 5];
    var num2 = [2, 1, 2, 3, 2, 4, 2, 5];
    var num3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5];
    var results = [0, 0, 0];
    var winer = [];

    answers.forEach((ans, i) => {
        if (ans === num1[i % num1.length]) results[0] += 1;
        if (ans === num2[i % num2.length]) results[1] += 1;
        if (ans === num3[i % num3.length]) results[2] += 1;
    })

    var max = Math.max(...results);
    results.forEach((result, i) => {
        if (result === max) winer.push(i + 1);
    })
    return winer;
}