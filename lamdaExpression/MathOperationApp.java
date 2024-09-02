package com.lamdaExpression;
import java.util.*;
import java.util.function.Function;

public class MathOperationApp {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(30);
        list.add(41);
        list.add(50);

        Function<Integer, Double> doubleValue = n -> n * 2.0;

        list.forEach(n -> {
            Double doubled = doubleValue.apply(n);
            System.out.println("Double value: " + doubled);
        });
    }
}
