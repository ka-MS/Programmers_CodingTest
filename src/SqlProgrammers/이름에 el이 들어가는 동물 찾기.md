# 이름에 el이 들어가는 동물 찾기
## 문제 설명
ANIMAL_INS 테이블은 동물 보호소에 들어온 동물의 정보를 담은 테이블입니다. ANIMAL_INS 테이블 구조는 다음과 같으며, ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE는 각각 동물의 아이디, 생물 종, 보호 시작일, 보호 시작 시 상태, 이름, 성별 및 중성화 여부를 나타냅니다.

NAME	TYPE	NULLABLE
ANIMAL_ID	VARCHAR(N)	FALSE
ANIMAL_TYPE	VARCHAR(N)	FALSE
DATETIME	DATETIME	FALSE
INTAKE_CONDITION	VARCHAR(N)	FALSE
NAME	VARCHAR(N)	TRUE
SEX_UPON_INTAKE	VARCHAR(N)	FALSE
보호소에 돌아가신 할머니가 기르던 개를 찾는 사람이 찾아왔습니다. 이 사람이 말하길 할머니가 기르던 개는 이름에 'el'이 들어간다고 합니다. 동물 보호소에 들어온 동물 이름 중, 이름에 "EL"이 들어가는 개의 아이디와 이름을 조회하는 SQL문을 작성해주세요. 이때 결과는 이름 순으로 조회해주세요. 단, 이름의 대소문자는 구분하지 않습니다.

## 풀이
대소문자 구분없이 검색하기 위해서는 LOWER/UPPER 함수를 사용하는 방법이 있다.
LOWER은 전달받은 문자를 소문자로 변환하여 리턴하고
UPPER은 대문자로 변환하여 리턴한다.
>WHERE LOWER(NAME) LIKE '%el%'

이렇게 작성하면 이름값을 모두 소문자로 바꾼 후 el문자가 들어간 이름을 검색한다.

## 답
SELECT ANIMAL_ID,NAME
FROM ANIMAL_INS
WHERE LOWER(NAME) LIKE LOWER('%el%')
AND ANIMAL_TYPE = 'Dog'
ORDER BY NAME