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