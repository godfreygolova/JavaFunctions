package FunctionalInterface;

import java.util.function.Function;
public class _Function
{

    public static void main(String[] args)
    {


        int number = increment(number:1);
        System.out.println(increment);
    }
    static Function<Integer, Integer> IncrementByOneFunction =
            number -> number++;
    static int increment(int number)
    {
        return number +1;
    }
}
