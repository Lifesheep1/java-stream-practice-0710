package com.choongang;
import java.util.*;

/*
## **문제**

`Member` 클래스를 이용해 회원의 이름과 성별을 관리하려고 합니다. `Member`타입의 List를 입력받아, 여성 회원의 수를 리턴해야 합니다.

## **입력**

### **인자 1 : members**

- `Member` 타입을 요소로 가지는 List

## **출력**

- `long` 타입을 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
 */
public class D_computeCountOfFemaleMember {
    public long computeCountOfFemaleMember(List<Member> members){
        // TODO:
        long result = 0;
        result = members.stream()
                .filter(n -> n!=null)
                .filter(n->n.getGender().equals("Female"))
                .count();


        return result;

    }

    static class Member {
        String name;
        String gender;

        public Member(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

    }
}
