package xue.demo4;

public class Person {

    private  String name;
    private int age;

    public void startExercise(Finess finess){
        System.out.println(this.name + "开始锻炼");
        finess.info();
        finess.finessPlan(new Plan("拉拉筋骨", "平板撑"));

    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
