package com.choongang;
import java.util.*;
/*
## **문제**

이번엔 `Member` 클래스를 이용해 회원의 이름, 성별, 나이까지 관리하려고 합니다. `Member` 타입을 요소로 가지는 List를 입력받아, 남성 회원들의 평균 나이를 리턴해야 합니다.

## **입력**

### **인자 1 : members**

- `Member` 타입을 요소로 가지는 List

## **출력**

- `double` 타입을 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
- 회원의 수가 0이거나, 남자 회원이 없는 경우 `0`을 리턴해야 합니다.
 */
public class E_computeAverageOfMaleMember {
    public double computeAverageOfMaleMember(List<Member> members) {
        // TODO:
        double result = 0;
        result = members.stream()
                .filter(n->n != null)
                .filter(n->n.getGender().equals("Male"))
                .mapToDouble(n-> n.getAge()).average().orElse(0);

        return result;

    }

    static class Member {
        String name;
        String gender;
        int age;

        public Member(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }
    }
}
