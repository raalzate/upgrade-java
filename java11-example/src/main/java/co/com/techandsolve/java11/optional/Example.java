package co.com.techandsolve.java11.optional;

import java.util.Optional;

public class Example {
    public static void main(String[] args) throws Exception {
        var op1 = Optional.of("hola");
        Optional<String> op2 = Optional.empty();


        op1.filter("hola"::equalsIgnoreCase)
                .ifPresentOrElse(val -> System.out.println("Yes"),
                        () -> System.out.println("No"));


        op2.or(() -> op1).filter("hola"::equalsIgnoreCase)
                .ifPresentOrElse(val -> System.out.println("Yes"),
                        () -> System.out.println("No"));

        System.out.println(op2.orElseGet(op1::get));

        op2.orElseThrow(() -> new Exception("Algo esta mal"));

    }
}
