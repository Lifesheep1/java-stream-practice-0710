package com.choongang;
import java.util.*;
/*
## **문제**

`String` 타입을 요소로 가지는 List를 입력받아 중복을 제거하고 정렬한 후 `String` 타입을 요소로 갖는 배열로 리턴해야 합니다.

## **입력**

### **인자 1 : names**

- `String` 타입을 요소로 가지는 List

## **출력**

- `String` 타입을 요소로 가지는 배열을 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
- 정렬은 사전식 순서로 정렬 되어야 합니다.
 */
public class F_makeUniqueNameArray {
    public String[] makeUniqueNameArray(List<String> names) {
        // TODO:
        String[] result = new String[0];
        result = names.stream()
                .distinct()
                .sorted()
                .toArray(String[]::new);

        return result;

    }
}
