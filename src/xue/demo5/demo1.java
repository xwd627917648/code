package xue.demo5;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class demo1 {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的出生年月:");

        String birthdayString = sc.next();

        SimpleDateFormat sdf = new SimpleDateFormat(birthdayString);

        Date birthdayDate = sdf.parse(birthdayString);

        Date todayDate = new Date();

        long birthSecond = birthdayDate.getTime();

        long todaysecond = todayDate.getTime();

        long second = todaysecond - birthSecond;

        System.out.println("出生了" + second/1000/60/60/24/365 + "年.");

    }
}
