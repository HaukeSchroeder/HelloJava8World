package java_8_class_3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Hauke Schröder on 19.07.16.
 *
 * Example code for learning purposes referencing the explanation from:
 * http://blog.hs85.de/2016/07/20/java-8-stream-api/
 *
 */
public class Java_8_Class_3 {

    public Java_8_Class_3() {
        List<String> myStringList = Arrays.asList("element1", "element2", "element3", "element4", "element5");

        for (String myStringElement : myStringList) {
            System.out.println (myStringElement);
        }

        //Transformierte Kurzschreibweise
//        myStringList.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String myStringElement) {
//                System.out.println("My String argument: "+myStringElement);
//            }
//        });
        myStringList.forEach(myStringElement -> System.out.println("My String argument: "+myStringElement));

        //--------------------------------------------

        myStringList.stream().forEach(myString -> System.out.println("My Stream String argument: "+myString));


        myStringList.stream()
                .filter(s -> Integer.parseInt(s.substring(s.length() - 1)) > 3)
                .forEach(myString -> System.out.println("My Stream String argument, greater than 3: " + myString));

    }
}
