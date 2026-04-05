package org.nnjavatechie.common.strems;

import java.util.List;
import java.util.stream.Collectors;

public class Mapping {

    public static void main(String[] args) {
        List<String> hello = List.of("Hello", "How are You!");
        List<String> collect = hello.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.print(collect);
    }
}
