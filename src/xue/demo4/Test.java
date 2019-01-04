package xue.demo4;

public class Test {

    public static void main(String[] args) {

        Person per = new Person("张三", 20);

        /*Plan p = new Plan("拉拉筋骨", "平板撑");

        Finess finess = new Finess() {
            @Override
            public void finessPlan(Plan p) {
                p.printPlan();
            }
        };
        per.startExercise(finess);
        finess.info();
        p.printPlan();*/

        per.startExercise(Plan::printPlan);
    }
}
