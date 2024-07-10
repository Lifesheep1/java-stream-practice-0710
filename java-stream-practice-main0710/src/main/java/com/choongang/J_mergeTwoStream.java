package com.choongang;
import java.util.*;
import java.util.stream.*;
/*
## **문제**

`String` 타입을 요소로 가지는 List 두 개를 입력받아, 스트림을 이용해 하나의 List로 합친 결과를 리턴해야 합니다.

## **입력**

### **인자 1 : list1**

- `String` 타입을 요소로 가지는 List

### **인자 2 : list2**

- `String` 타입을 요소로 가지는 List

## **출력**

- `String` 타입을 요소로 가지는 List를 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
 */
public class J_mergeTwoStream {
    public List<String> mergeTwoStream(List<String> list1, List<String> list2) {
        // TODO:

        Stream<String> stream1 = list1.stream();
        Stream<String> stream2 = list2.stream();

        //두 스트림을 하나로 합치기
        Stream<String> combinedStream = Stream.concat(stream1, stream2);

        List<String> combinedList = combinedStream.collect(Collectors.toList());

        return combinedList;
    }
}
