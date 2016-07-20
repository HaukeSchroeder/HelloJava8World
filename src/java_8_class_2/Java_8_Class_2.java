package java_8_class_2;

import java.util.function.Function;

/**
 * Created by Hauke Schröder on 19.07.16.
 *
 * Example code for learning purposes referencing the explanation from:
 * http://blog.hs85.de/2016/07/20/java-8-functional-interfaces/
 *
 * Code based uppon: http://bruceeckel.github.io/2015/10/17/are-java-8-lambdas-closures/
 *
 */
public class Java_8_Class_2 {

    private Function<Integer, Integer> make_fun() {
        int n = 0;
        return arg -> {
            System.out.print("n: "+ n + " | arg: " + arg + " | arg+1: " + (arg + 1) + " | (n + (arg + 1)): ");
            arg += 1;
            return n + arg;
        };
    }

    protected void try_it() {
        Function<Integer, Integer>
                x = make_fun(),
                y = make_fun();
        for(int i = 0; i < 5; i++)
            System.out.println(x.apply(i));
        System.out.println("");
        for(int i = 10; i < 15; i++)
            System.out.println(y.apply(i));
    }

    /*------------------------------------------------------------*/

    private class MyWrapperClass {
        int n = 0;
    }

    private Function<Integer, Integer> make_fun2() {
        MyWrapperClass myWrapperClass = new MyWrapperClass();
        return arg -> {
            System.out.print("n: "+ myWrapperClass.n + " | arg: " + arg + " | arg+1: " + (arg + 1) + " | (n + (arg + 1)): ");
            arg += 1;
            myWrapperClass.n += arg;
            return myWrapperClass.n + arg;
        };
    }

    protected void try_it2() {
        Function<Integer, Integer>
                x = make_fun2(),
                y = make_fun2();
        for(int i = 0; i < 5; i++)
            System.out.println(x.apply(i));
        System.out.println("");
        for(int i = 10; i < 15; i++)
            System.out.println(y.apply(i));
    }

}
