package day3.crt;

import java.util.Scanner;

abstract class Dosage {
    int age;
    String nationality;

    void firstDose() {
        if (nationality != null && nationality.equalsIgnoreCase("indian") && age >= 18) {
            System.out.println("After taking first dose you want to pay 250rs");
            secondDose();
            boosterDose();
        } else {
            System.out.println("Not eligible");
        }
    }

    void secondDose() {
        System.out.println("your second dose is successful");
    }

    abstract void boosterDose();
}

class Vaccine extends Dosage {

    void boosterDose() {
        System.out.println("your booster dose is successful");
    }
}

public class Assignment8 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Vaccine v = new Vaccine();

        System.out.println("enter the age : ");
        v.age = s.nextInt();

        System.out.println("enter the nationality : ");
        v.nationality = s.next();

        v.firstDose();
    }
}
