package xue.demo1;

public class Test1 {

    public static void main(String[] args) {
//  打印1到100之间的整数
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            //判断数字中包含9的要跳过,用if语句
            if (i % 10 != 9 && i / 10 != 9) {

                System.out.print(i + " ");
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
