package com.choongang;
import java.util.*;
/*
## **문제**

`String` 타입을 요소로 가지는 배열을 입력받아, 가장 길이가 긴 문자열 요소의 **길이**를 리턴해야 합니다.

## **입력**

### **인자 1 : strArr**

- `String` 타입을 요소로 가지는 배열

## **출력**

- `int` 타입을 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
- 빈 배열을 입력받은 경우 `0`을 리턴해야 합니다.
 */
public class I_findLongestLength {
    public int findLongestLength(String[] strArr) {
        // TODO:
        int result;

        result = Arrays.stream(strArr).map(String::length).max(Integer::compare).orElse(0);

        return result;
    }
}
