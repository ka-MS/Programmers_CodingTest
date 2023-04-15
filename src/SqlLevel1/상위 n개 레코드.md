## 문제 설명
ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. ANIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
INTAKE_CONDITION	VARCHAR(N)	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_INTAKE	VARCHAR(N)	FALSE
동물 보호소에 가장 먼저 들어온 동물의 이름을 조회하는 SQL 문을 작성해주세요.

## 풀이
### ORACLE
ROWNUM을 사용하면 데이터에 일련번호를 붙여 테이블이나 집합에서 원하는 행만 가져올 수 있다.
WHERE ROWNUM <= 3; 와 같이 작성하면 TOP3의 데이터를 가져올 수 있다.
이번 문제에서 주의해야할 부분은 아래와 같이 작성했을 때 작동하지 않는다는 것 이다.
>SELECT NAME
FROM ANIMAL_INS
WHERE ROWNUM = 1
ORDER BY DATETIME;


쿼리문은 FROM - ON (JOIN 조건) - JOIN - WHERE - GROUP BY - HAVING - SELECT - DISTINCT - ORDER BY 순으로 실행된다.
위와 같이 작성하면 DATETIME으로 정렬하기 전에 WHERE문으로 ROWNUM 1개를 뽑았기 때문에 의도한 결과가 나오지 않는다.
그렇기 때문에 서브쿼리를 사용하여 먼저 정렬을 하고 정렬된 집합에서 1번 데이터를 가져오는 방식을 사용해야 한다.

### MYSQL
MYSQL에서는 LIMIT을 사용하여 데이터를 가져올 수 있다.
LIMIT 5; 와 같이 작성하면 TOP5개의 데이터를 가져오고
LIMIT 4,10;과 같이 작성하면 5번째부터 10개를 가져오게 된다.
여기서 주의해야할 점은 ,를 사용하여 범위를 지정했을 때 첫번째 파라미터는 0부터 시작한다.

## ORACLE
>SELECT NAME 
FROM (
    SELECT NAME
    FROM ANIMAL_INS
    ORDER BY DATETIME)
WHERE ROWNUM = 1;

## MYSQL
>SELECT NAME
FROM ANIMAL_INS
ORDER BY DATETIME
LIMIT 1;