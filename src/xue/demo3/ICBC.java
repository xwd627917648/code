package xue.demo3;

public class ICBC extends Card implements Credit{

    @Override
    public void cardholder(Person p) {

        System.out.println(p.getName() + "使用的是" + super.getName() + "信用卡");
    }

    @Override
    public void prepaid() {
        System.out.println("信用卡可以先消费");
    }

    public ICBC() {
    }

    public ICBC(String name) {
        super(name);
    }


}
