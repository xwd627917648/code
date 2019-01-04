package xue.demo3;

public class Test {

    public static void main(String[] args) {

        ICBC bank = new ICBC("招商银行");
        Person p = new Person("马云");

        bank.prepaid();
        bank.save();
        bank.cardholder(p);
    }
}
