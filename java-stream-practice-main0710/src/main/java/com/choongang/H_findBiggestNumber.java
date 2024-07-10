package com.choongang;
import java.util.*;
/*
## **문제**

`int` 타입을 요소로 가지는 배열을 입력받아 가장 큰 요소를 리턴해야 합니다.

## **입력**

### **인자 1 : arr**

- `int` 타입을 요소로 가지는 배열

## **출력**

- `Integer` 타입을 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
- 빈 배열을 입력받은 경우 `null`을 리턴해야 합니다.
 */
public class H_findBiggestNumber {
    public Integer findBiggestNumber(int[] arr) {
        // TODO:
        Integer result = 0;
        if (arr.length == 0){
            return null;
        }

        result = Arrays.stream(arr).max().getAsInt();

        return result;
    }
}
