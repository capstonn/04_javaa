//package v20250508.ch17.sec12.exam01;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class DelayOperation {
//
//    public static void main(String[] args) {
//
//        List<String> names = Arrays.asList("신짱구","훈이","유리","김철수");
//
//        Stream<String> stream = names.stream().filter(name -> {
//            System.out.println("filter: " + name);
//            return name.length() > 2;
//        }).map(name -> {
//            System.out.println("map: " + name);
//            return name + '님';
//        });
//
//        Thread.sleep(3000);
//
//        // 최종 연산 호출
//        stream.forEach(System.out::println);
//    }
//}