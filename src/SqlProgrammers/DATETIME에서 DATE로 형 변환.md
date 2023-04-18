# DATETIME에서 DATE로 형 변환
## 문제 설명
ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. ANIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
INTAKE_CONDITION	VARCHAR(N)	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_INTAKE	VARCHAR(N)	FALSE
ANIMAL_INS 테이블에 등록된 모든 레코드에 대해, 각 동물의 아이디와 이름, 들어온 날짜1를 조회하는 SQL문을 작성해주세요. 이때 결과는 아이디 순으로 조회해야 합니다.

## 풀이
### ORACLE
오라클의 경우 TO_CHAR를 통해 날짜,숫자등의 값을 문자열로 변환할 수 있다.
**날짜 포맷 변경**
>TO_CHAR(SYSDATE, 'YYYY/MM/DD')            --2020/07/23
TO_CHAR(SYSDATE, 'AM HH:MI:SS')           --오전 11:44:31
TO_CHAR(SYSDATE, '""YYYY"년 "MM"월 "DD"일"') --2020년 07월 23일

**소수점 변경**
>TO_CHAR(123.456, 'FM990.999') --123.456

**숫자의 천 단위 콤마 찍기**
>TO_CHAR(123467, 'FM999,999')        --123,467

**지정한 길이 만큼 "0"으로 채우기**
>TO_CHAR(123, 'FM00000') --00123

### MYSQL
DATE_FORMAT 함수를 통해 데이터 표시 방식을 바꿀 수 있다.
>DATE_FORMAT(SYSDATE(),'%Y-%M-%D') --2023-April-16th
DATE_FORMAT(SYSDATE(),'%y-%m-%d') --23-04-16

예시처럼 오라클과 날짜 표현방식에 차이가 있으며 대소문자에 따라 다르게 표시된다.
현재 날짜를 나타내는 함수 표현방식은 NOW()와 SYSDATE()로 나타낸다.
두 함수의 차이점은 쿼리가 길어질 경우, 출력되는 시간이 고정되냐 변하느냐의 차이이다.
NOW는 쿼리가 처음 시작되는 시간이 고정되지만 SYSDATE()는 연산할 때 마다 시간이 변한다.

## 답
### ORACLE
>SELECT ANIMAL_ID,NAME,TO_CHAR(DATETIME,'YYYY-MM-DD') AS 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID

### MYSQL
>SELECT ANIMAL_ID,NAME,DATE_FORMAT(DATETIME,'%Y-%m-%d') AS 날짜
FROM ANIMAL_INS
ORDER BY ANIMAL_ID