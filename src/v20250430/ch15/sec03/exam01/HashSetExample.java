package v20250430.ch15.sec03.exam01;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java"); // 중복은 저장되지 않음
        set.add("IBATIS");

        int size = set.size();
        System.out.println("총 객체 수: " + size);
    }
}

// 실행 결과
// 총 객체 수 : 4
