package v20250508.ch17.sec04.exam01;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        for (int i = 0; i <=5; i++) {
            Product product = new Product(i, "상품"+i, " 멋진회사 ", (int)(Math.random()*10000));
            list.add(product);
        }
    }
}