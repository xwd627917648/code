package xue.demo2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Computer one = new Computer("DELL", 6799, "一体机");
        Computer two = new Computer("MacAir", 7488, "颜值担当");
        Computer three = new Computer("MIAir", 4288, "轻薄笔记本");

        ArrayList<Computer> list_cp = new ArrayList<>();
        list_cp.add(one);
        list_cp.add(two);
        list_cp.add(three);

        ArrayList<Computer> air = filter(list_cp, "Air");
        for (int i = 0; i < air.size(); i++) {
            System.out.println(air.get(i).getName() + " "
                    + air.get(i).getPrice() + " " + air.get(i).getType());
        }
    }

    public static ArrayList<Computer> filter
            (ArrayList<Computer> list, String str) {

        ArrayList<Computer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i).getName().lastIndexOf(str);
            if (n == list.get(i).getName().length() - str.length()) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
