package co.com.techandsolve.java11.string;

import java.util.stream.Collectors;


public class Example {


    public static void main(String[] args) {

        String str = "Hello \n World, I,m\nSolver.";
        String emptyStr = "";
        String originalStr = "  techandsolve.com  ok  ";


        //lines
        str.lines().collect(Collectors.toList());
        str.lines().forEach(System.out::println);

        //is blank
        emptyStr.isBlank();
        emptyStr.isEmpty();

        //string whose value is this string
        originalStr.stripTrailing();
        originalStr.stripLeading();
        originalStr.strip();

        //repeat
        "Solver,".repeat(10);


    }

}
