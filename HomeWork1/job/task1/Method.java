package task1;

public class Method {

    public void divideByZero(int a, int b) {
        System.out.println(a / b);
    }

    public void sumOfDifferentArrays(int[] massive1) {
        int massive2[] = new int[] { 1, 2, 3, 4, 5 };
        int massive3[] = new int[5];
        for (int i = 0; i < massive1.length; i++) {
            massive3[i] = massive1[i] + massive2[i];
        }
        for (int i : massive3) {
            System.out.print(i + " ");
        }
    }

    public int stackOverFlow(int number) {
        System.out.println();
        if (number < 10) {
            System.out.println("Всё отличон, переполнения стека не случится");
            return number;
        } else {
            return number * stackOverFlow(number - 1);
        }
    }
}
