package xue.demo1;

public class test {

    public static void main(String[] args) {
        String str = "asdjklfghjk";
        String str1 = str.substring(3,5);

        String s = str.replaceAll("jk", "hl");
        System.out.println(s);
    }
}
