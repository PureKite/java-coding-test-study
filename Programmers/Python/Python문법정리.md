# Python 코테 문법 정리
- 그냥 모르는 거 다 정리하는 공간

### 문자열 for문 순회
'''
for i in str
'''

### 숫자 -> 문자, 문자 -> 숫자 변환
int("123")
str(123)

#### 간단하게 map 사용하는 법
sum(map(int, str(number)))

### python if 한 줄 사용법
"Even" if num%2==0 else "Odd"

### 제곱근
import math

math.sqrt(num)

### 배열 합치기
''.join(arr)

### 문자열 뒤집기
[::-1]
list(map(int, reversed(str(n)))) // reversed

### a, b 바꾸기
a, b = b, a

### 대문자, 소문자
str.upper()
str.lower()

### 문자열에서 특정 문자 count
str.count('y')

### 2가지의 리스트를 같이 사용하고 싶을 때
for absolutes, sign in zip(absolutes, signs)

### index를 활용하여 문자열에 넣는 법
"김서방은 {}에 있다".format(seoul.index('Kim'))

### 문자열, 리스트 길이 구하는 방법
len(문장열)
len(리스트)

### 리스트 길이 합치기
('*'*(len(s)-4)) + s[-4:]
