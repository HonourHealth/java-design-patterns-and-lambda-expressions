package com.onurcan.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        //String email = "notNull@gmail.com";
        String email = null;
        //of, empty, ofNullable
//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);

//        Optional<String> emailOptional = Optional.of(email);
//        System.out.println(emailOptional);

        Optional<String> stringOptional = Optional.ofNullable(email);
        String defaultOptional = stringOptional.orElse("default@gmail.com");
        System.out.println(defaultOptional);

        String defaultOptional2 = stringOptional.orElseGet(() -> "default@gmail.com");
        System.out.println(defaultOptional2);

//        String optinalObject = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email is not exist"));
//        System.out.println(optinalObject);

        Optional<String> gender = Optional.of("MALE");
        Optional<String> emptyOptional = Optional.empty();

        gender.ifPresent(s -> System.out.println("value is present"));

//        if (stringOptional.isPresent()) {
//            System.out.println(stringOptional.get());
//        } else {
//            System.out.println("No value present");
//        }

        String result = " abc ";
        if (result != null && result.contains("abc")) {
            System.out.println(result);
        }

        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                .map(String::trim)
                .ifPresent(System.out::println);

    }
}
