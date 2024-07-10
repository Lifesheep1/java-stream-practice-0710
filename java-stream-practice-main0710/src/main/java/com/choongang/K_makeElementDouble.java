package com.choongang;
import java.util.*;
import java.util.stream.*;

/*
## **문제**

`Integer` 타입을 요소로 가지는 List를 입력받아 각 요소에 2를 곱한 새로운 List를 리턴해야 합니다.

## **입력**

### **인자 1 : list**

- `Integer` 타입을 요소로 가지는 List

## **출력**

- `Integer` 타입을 요소로 가지는 List를 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
- 비어있는 리스트를 입력받은 경우, 비어있는 리스트를 리턴해야 합니다.
 */
public class K_makeElementDouble {
    public List<Integer> makeElementDouble(List<Integer> list) {
        // TODO:
        List<Integer> list1;
        list1 = list.stream()
                .map(n->n * 2)
                .collect(Collectors.toList());

        return list1;
    }
}
