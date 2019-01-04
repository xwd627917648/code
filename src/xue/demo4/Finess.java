package xue.demo4;

public interface Finess {

    void finessPlan(Plan p);

    default void info(){

        sport1();
        sport2();
    }

    private void sport1(){
        System.out.println("每天动一动,享受健康生活");
    }

    private  void sport2(){
        System.out.println("记得要做热身运动哦");
    }
}
