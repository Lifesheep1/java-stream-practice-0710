package com.choongang;
import java.util.*;
import java.util.stream.*;
/*
## **문제**

남성 회원 이름의 List와 여성 회원 이름의 List가 있습니다. 남성 회원과 여성 회원 중 특정 성씨를 갖고 있는 사람의 명단이 필요합니다. 중복된 이름은 제거하고 특정 성씨를 갖고 있는 회원들의 이름을 정렬한 후 List로 리턴해야 합니다.

## **입력**

### **인자 1 : male**

- `String` 타입을 요소로 가지는 List

### **인자 2 : female**

- `String` 타입을 요소로 가지는 List

### **인자 3 : lastName**

- `String` 타입의 변수

## **출력**

- `String` 타입을 요소로 가지는 List를 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
- 일치하는 회원이 없는 경우 비어있는 List를 리턴해야 합니다.
- 중복 요소는 허용하지 않습니다.
- 사전식 순서로 정렬이 필요합니다.
 */
public class M_findPeople {
    public List<String> findPeople(List<String> male, List<String> female, String lastName) {
        // TODO:

        Stream<String> stream1 = male.stream();
        Stream<String> stream2 = female.stream();

        Stream<String> combinedStream = Stream.concat(stream1,stream2);

        List<String> combinedList = combinedStream.collect(Collectors.toList());

        return combinedList.stream()
                .filter(n->n.startsWith(lastName))
                .distinct()
                .sorted().collect(Collectors.toList());
    }
}
