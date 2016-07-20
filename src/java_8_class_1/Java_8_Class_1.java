package java_8_class_1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Hauke Schröder on 19.07.16.
 *
 * Example code for learning purposes referencing the explanation from:
 * http://blog.hs85.de/2016/07/20/java-8-functional-interfaces/
 *
 */
public class Java_8_Class_1 {

    public Java_8_Class_1() {
        List<String> myStringList = Arrays.asList("element1", "element2", "element3");

        for (String myStringElement : myStringList) {
            System.out.println (myStringElement);
        }

        myStringList.forEach(new Consumer<String>() {
            @Override
            public void accept(String myStringElement) {
                System.out.println("My String argument: "+myStringElement);
            }
        });
    }
}
