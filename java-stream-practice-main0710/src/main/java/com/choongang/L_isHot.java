package com.choongang;
import java.util.*;
/*
## **문제**

이번주의 최고 온도만을 모아놓은 List를 분석하여 이번주가 더웠는지 알아봅시다. 최고 기온이 30도를 이상 날이 3일 이상이면 true를, 그렇지 않다면 false를 리턴해야 합니다.

## **입력**

### **인자 1 : temperature**

- `int` 타입을 요소로 가지며 길이가 7인 배열

## **출력**

- `boolean` 타입을 리턴해야 합니다.

## **주의 사항**

- 반복문(`for`, `while`) 사용은 금지됩니다.
- 30도 이상은 30도를 포함합니다.
- 입력받은 배열의 길이가 7이 아닌 경우 false를 리턴해야 합니다.
 */
public class L_isHot {
    public boolean isHot(int[] temperature) {
        // TODO:
        long i =0;
        i = Arrays.stream(temperature)
                .filter(n->temperature.length == 7)
                .filter(n->n>=30)
                .count();

        if (i >= 3){
            return true;
        }else {
            return false;
        }

    }
}
