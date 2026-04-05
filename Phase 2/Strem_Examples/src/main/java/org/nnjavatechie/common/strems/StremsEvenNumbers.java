package org.nnjavatechie.common.strems;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StremsEvenNumbers {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10,11,12);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        List<Integer> even = collect.get(true);
        List<Integer> add = collect.get(false);
        System.out.println("Even "+even);
        System.out.println("add "+add);
    }

}
