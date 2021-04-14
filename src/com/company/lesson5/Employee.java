package com.company.lesson5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

    private String surname;
    private String name;
    private String secondname;
    private String post;
    private String email;
    private String numberPhone;
    private float salary;
    private int birthYear;

    public Employee(String surname, String name, String secondname, String post, String email,
                    String numberPhone, float salary, int birthYear) {
        this.surname = surname;
        this.name = name;
        this.secondname = secondname;
        this.post = post;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public int getAge() {
        LocalDate date = LocalDate.now();
        String currentYear = date.format(DateTimeFormatter.ofPattern("yyyy"));
        return Integer.parseInt(currentYear) - birthYear;
    }

/*    Вывод информации об объекте в консоль по заданию
    public void printInfo() {
        System.out.println(surname + " " + name  + " " + secondname + " / "
                            + post + " / " + email + " / " + numberPhone + " / "
                            + salary + " RUR / " + getAge() + " years old.");
    }
*/

    public String getFullInfo () {
        return surname + " " + name  + " " + secondname + " / "
                + post + " / " + email + " / " + numberPhone + " / "
                + salary + " RUR / " + getAge() + " years old.";

    }

    public String getInfo () {
        return surname + " " + name  + " " + secondname + " / "
                + post + " / " + getAge() + " years old.";

    }
}
