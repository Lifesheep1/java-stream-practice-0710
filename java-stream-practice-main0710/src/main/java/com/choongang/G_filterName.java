package com.choongang;
import java.util.*;
/*
## **문제**

`String`타입을 요소로 가지는 List를 입력받아 중복을 제거하고 김씨 성을 가진 이름들을 정렬하여 문자열 배열로 리턴해야 합니다.

## **입력**

### **인자 1 : names**

- `String` 타입을 요소로 가지는 List

## **출력**

- `String` 타입을 요소로 가지는 배열을 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
- 입력받은 리스트에 김씨가 없거나, 리스트의 크기가 0인 경우 빈 배열을 리턴해야 합니다.
- 정렬은 사전식 순서로 정렬 되어야 합니다.
 */
public class G_filterName {
    public String[] filterName(List<String> names) {
        // TODO:
        String[] result = new String[0];

        result = names.stream()
                .filter(n->n.startsWith("김"))
                .distinct()
                .sorted()
                .toArray(String[] :: new);

        return result;

    }
}
