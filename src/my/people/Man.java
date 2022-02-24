package my.people;

import java.math.BigDecimal;

public class Man {

    int age=18;
    String firstName = "Вася";
    char nameIetter = 'V';
    int binAge = 0b010101;
    int octAge = 025;
    int hexAge = 0xFF;
    long cell = 1_000_000;
    float weight = 1.11F;
    double height = 0.34;
    boolean isSingl = false;
    short s1 = 123;
    byte b1 = 123;


    public int getAge() {
        int newAge = 25;
        age=newAge;
        return age;
    }

}
