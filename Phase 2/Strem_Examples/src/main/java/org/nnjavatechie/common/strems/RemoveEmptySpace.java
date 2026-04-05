package org.nnjavatechie.common.strems;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveEmptySpace {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello", "Hi", "How are You!", "I am Fine"," ",null);
        List<String> collect = list.stream()
                .filter(Objects::nonNull).filter(f -> !f.isBlank())
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
