package com.lamdaExpression;
import java.util.*;
import java.util.function.Consumer;

public class MathOperationApp {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Method 1: Traversing using iterator
        Iterator<Integer> it = list.iterator(); 
        while (it.hasNext()) {
            Integer n = it.next();
            System.out.println("method1: Iterator value :: " + n);
        }

        // Method 2: Traversing with Consumer interface implementation
        class MyConsumer implements Consumer<Integer> {
            public void accept(Integer t) {
                System.out.println("method2: Consumer implementation value :: " + t);
            }
        }
        MyConsumer action = new MyConsumer();
        list.forEach(action);

        // Method 3: Traversing with anonymous Consumer interface implementation
        list.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("method3: For each anonymous class value :: " + t);
            }
        });

        // Method 4: Explicit lambda function
        Consumer<Integer> listAction = n -> {
            System.out.println("method4: For each lambda implementation value :: " + n);
        };
        list.forEach(listAction);

        // Method 5: Implicit lambda function
        list.forEach(n -> {
            System.out.println("method5: For each implementation value :: " + n);
        });
    }
}
