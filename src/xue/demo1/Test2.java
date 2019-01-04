package xue.demo1;

public class Test2 {

    public static void main(String[] args) {

        for (int i = 1; i < 10; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1 + "*" + i + "=" + (i1 * i) + " ");
            }
                System.out.println();

        }

    }
}
