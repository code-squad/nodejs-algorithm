/*
https://programmers.co.kr/learn/courses/30/lessons/59411
*/

SELECT INS.ANIMAL_ID, INS.NAME FROM ANIMAL_INS AS INS
LEFT JOIN ANIMAL_OUTS AS OUTS
ON INS.ANIMAL_ID = OUTS.ANIMAL_ID
WHERE OUTS.ANIMAL_ID IS NOT NULL
ORDER BY INS.DATETIME - OUTS.DATETIME
LIMIT 2;
