package java_8_class_4;

import java.util.Optional;

/**
 * Created by Hauke Schröder on 18.01.17.
 *
 * Example code for learning purposes referencing the explanation from:
 * http://blog.hs85.de/2017/01/18/java-8-optionals/
 *
 */

public class Java_8_Class_4_Optional_Generator {

    public static Optional<Integer> getOptionalWithRandomIntegerOrNull(boolean shouldBeNull) {
        Optional<Integer> ret = Optional.empty(); //is redundant because it is initialized later, just showcase purposes

        if(!shouldBeNull) {
            ret = Optional.of((int)(Math.random() * 100)); //value has to be not null
        } else {
            ret = Optional.ofNullable(null); //value might be null
        }

        return ret;
    }

}
