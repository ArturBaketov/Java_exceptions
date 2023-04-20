package task1;

/* 
 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
*/

public class Main {
    public static void main(String[] args) {

        Method method = new Method();
        method.divideByZero(10, 2);
        // method.divideByZero(10, 0);
        // делить на 0 нельзя "ArithmeticException: / by zero"

        int[] massive = new int[] { 1, 1, 1, 1, 1 };
        // int[] massive = new int[] { 1, 1, 1, 1, 1, 1 };
        method.sumOfDifferentArrays(massive);
        // выход за пределы массива "ArrayIndexOutOfBoundsException: Index 5 out of
        // bounds for length 5"

        method.stackOverFlow(9);
        // method.stackOverFlow(10)
        // переполнение стека "Stack overflow"

    }
}
