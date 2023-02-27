package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Traditional Incrementing

        int increment =incrementByOne(5);
        System.out.println("Traditional Increment : " +increment);

        // Functional Increamenting

       int increment_1 =incrementByOneFunction.apply(9);
        System.out.println("Functinal Programming Increment : "+ increment_1);


        // Function Chaining

        int mutiply=multiplyBy10.apply(increment_1);
        System.out.println("Traditional Chaining: "+ mutiply);

        // Using andThen chaining

        Integer chained = incrementByOneFunction.andThen(multiplyBy10).apply(7);

        System.out.println("Using andThen to chain : "+ chained);

        // BiFunction take 2 argumets and produces 1 result

        System.out.println(incrementByOneAndMultiply(3,100));

        System.out.println(incrementByOneAndMultiplyByFunction.apply(4,100));

    }
// Traditional way
    static int incrementByOne(int num){

        return num+1;
    }



    //  Using functional

  static  Function<Integer,Integer> incrementByOneFunction
            = number -> number+1;

    static Function<Integer,Integer> multiplyBy10=number->number*10;

    // BiFunction take 2 arguments and produces 1 result

    // Traditional example
    static  int incrementByOneAndMultiply(int number, int numToMultiplyBy){

        return (number+1)*numToMultiplyBy;
    }
// BiFunction implementation
   static BiFunction<Integer,Integer,Integer>incrementByOneAndMultiplyByFunction=
            (numberToIncrementByObe, numberToMultipy)->(numberToIncrementByObe+1)*numberToMultipy;
}
