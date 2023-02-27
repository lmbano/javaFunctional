package functionalInterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment =increment(5);
        System.out.println("Incremented number is : " +increment);

       int increment_1 =incrementByOneFunction.apply(9);
        System.out.println(increment_1);
    }

    static int increment(int num){

        return num+1;
    }

    /// using functional

  static  Function<Integer,Integer> incrementByOneFunction
            = number -> number++;
}
