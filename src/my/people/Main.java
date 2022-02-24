package my.people;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List list = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        Man myMan2;
        Man myMan1 = new Man();
        System.out.println(myMan1.getAge());

        myMan2 = myMan1;
        System.out.println(myMan2.getAge());
        myMan2.age = 25;
        System.out.println(myMan2.getAge());
        System.out.println(myMan1.getAge());

        for (int i=0; i<1500000000;i++)
            list.add(new Man(i));
        Thread.sleep(1);
        list=null;
        


    }
}
class C extends  A { }//subclass C ребенок
class A{ }// super class A папа
