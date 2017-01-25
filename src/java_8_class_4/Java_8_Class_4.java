package java_8_class_4;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Created by Hauke Schröder on 18.01.17.
 *
 * Example code for learning purposes referencing the explanation from:
 * http://blog.hs85.de/2017/01/18/java-8-optionals/
 *
 */

public class Java_8_Class_4 {

    public Java_8_Class_4() {
        Optional<Integer> integerOptional = Java_8_Class_4_Optional_Generator.getOptionalWithRandomIntegerOrNull(false);

        System.out.println("My Integer is: " + integerOptional.get());

        Optional<Integer> integerOptionalWithNull = Java_8_Class_4_Optional_Generator.getOptionalWithRandomIntegerOrNull(true);
        try {
            System.out.println("My Integer is: " + integerOptionalWithNull.get());
        } catch (NoSuchElementException noSuchElementException) {
            System.out.println("Not the way an Optional should be used ;-)");
        }

        //If a value is not present as shown in this example choose orElse() to use a fallback value
        System.out.println("My Integer is: " + integerOptionalWithNull.orElse(1337));

        //You can throw exceptions if you need an exceptional process to run on not present value
        try {
            integerOptionalWithNull.orElseThrow(() -> new Java_8_Class_4_Exception("Careful the value is not present"));
        } catch (Java_8_Class_4_Exception ex) {
            System.out.println("You have thrown an Java_8_Class_4_Exception.");
        }

        //or you can use it as condition
        if(integerOptionalWithNull.isPresent()) {
            System.out.println("value is present");
        } else {
            System.out.println("value is not present");
        }

        //line is printed because the value is present
        integerOptional.ifPresent(System.out::println);
        //line is not printed because the value is not present
        integerOptionalWithNull.ifPresent(System.out::println);

        //map only works on present values but if a value is not present it is handled quite usable
        System.out.println("My mapped value should be multiplied by 100 and is: "+
                integerOptionalWithNull.map(integer -> integer * 100));
        //here we see, that the value is present and stays wrapped in the Optional but the operation is performed
        System.out.println("My mapped value should be multiplied by 100 and is: "+
                integerOptional.map(integer -> integer * 100));
        //Optionals are value based classes and are per definition final and immutable
        System.out.println("But the value in the Optional is not changed" + integerOptional.get());

        //filtering Optionals
        integerOptional.filter(integer -> integer < 50).ifPresent(integer -> System.out.println("value is less than 50: "+integer));
        integerOptional.filter(integer -> integer == 50).ifPresent(integer -> System.out.println("value is exactly 50: "+integer));
        integerOptional.filter(integer -> integer > 50).ifPresent(integer -> System.out.println("value is greater than 50: "+integer));
    }
}
