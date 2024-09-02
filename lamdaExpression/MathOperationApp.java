package com.lamdaExpression;
import java.util.*;
import java.util.function.Predicate;

public class MathOperationApp {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(21);
        list.add(30);
        list.add(41);
        list.add(50);

        Predicate<Integer> isEven = n-> n%2 ==0;
        
        list.forEach(n -> {
            if(isEven.test(n)) {
            	System.out.println("Even numbers: "+n);
            }
        });
    }
}
