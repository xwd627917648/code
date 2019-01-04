package xue.demo3;

public interface Credit {

    void prepaid();

    default void save(){
        System.out.println("可以存钱");
    }
}
