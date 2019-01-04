package xue.demo1;

public class Test3 {

    public static void main(String[] args) {

        System.out.println("sum = " + getSum(10,5));
        System.out.println("num = " + getSum1(10.67,5.33));
        System.out.println("cir = " + getCircumference(113,25));
        System.out.println("area = " + getArea(10,25));

    }

    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }

    public static double getSum1(double a, double b){
        double num = a + b;
        return num;
    }

    public static int getCircumference(int width,int length){
        int cir = (width + length) * 2;
        return cir;
    }

    public static int getArea(int width,int length){
        int area = width * length;
        return area;
    }
}
