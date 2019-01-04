package xue.demo1;

public class Test4 {

    public static void main(String[] args) {

        int[] score = {80, 90, 85, 90, 58, 88, 89, 93, 98, 75};

        int count = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] < 60) {
                count++;
            }
        }
        System.out.println("低于60分的人数: " + count);
    }
}
