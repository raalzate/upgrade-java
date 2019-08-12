package co.com.techandsolve.java11.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.entry;



public class Example {

    private static Logger LOGGER = Logger.getLogger(Example.class.getPackageName());

    private static void streamExample(){
        var stream =  Stream.iterate(1L, n -> n+1).limit(10);

        stream.takeWhile(v -> v<2);
        stream.dropWhile(v -> v<5);

       // stream.collect(Collectors.toList())

        Stream.ofNullable("");
    }

    public static void main(String[] args) {
        var immutableSet = Set.of("A", "E", "I", "O", "U");
        var immutableList = List.of("element1", "element2");
        var immutableMap = Map.of(1, "Proteccion", 2, "Banismo");
        var immutableMapEntry = Map.entry(100, "Colombia");
        var immutableEntryMap = Map.ofEntries(
                entry(20, "Medellin"),
                entry(30, "Cali"),
                entry(40, "Bogota")
        );
        var immutableCollector = Stream.of("A", "E", "I", "O", "U")
                .collect(Collectors.toUnmodifiableList());

        LOGGER.info(immutableMap.toString());
        LOGGER.info(immutableEntryMap.toString());
        LOGGER.info(immutableMapEntry.toString());
        LOGGER.info(immutableList.toString());
        LOGGER.info(immutableSet.toString());
        LOGGER.info(immutableCollector.toString());
    }

}
