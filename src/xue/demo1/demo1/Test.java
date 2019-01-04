package xue.demo1.demo1;

import java.util.ArrayList;

public class Test {


    public static void main(String[] args) {
        Student stu1 = new Student("张三", 16, 89);
        Student stu2 = new Student("李四", 17, 98);
        Student stu3 = new Student("王五", 16, 78);
        Student stu4 = new Student("赵六", 18, 99);
        Student stu5 = new Student("吴七", 17, 45);

        ArrayList<Student> list = new ArrayList<>();

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        System.out.println( maxScore(list).toString());

    }

    public static Student maxScore(ArrayList<Student> list) {
        int maxIndex = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).getScore() > list.get(maxIndex).getScore()) {
                maxIndex = i;

            }
        }
            return list.get(maxIndex);
    }
}
