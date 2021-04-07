package com.company.lesson5;

public class Main {
    public static void main(String[] args) {

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Serduk", "Petr", "Il'ich", "Director", "spi@mail.ru", "8(495)888-45-21", 97000f, 1976);
        employeesArray[1] = new Employee("Romanov", "Eduard", "Bogdanovich", "Engineer", "reb@mail.ru", "8(495)888-45-22", 73000f, 1979);
        employeesArray[2] = new Employee("Bezrukov", "Dmitrii", "Vladimirovich", "Engineer", "bdv@mail.ru", "8(495)888-56-31", 68000f, 1980);
        employeesArray[3] = new Employee("Bikova", "Anna", "Ivanovna", "Economist", "bai@mail.ru", "8(495)888-43-12", 63000f, 1988);
        employeesArray[4] = new Employee("Rikov", "Andrei", "Vital'evich", "intern", "rav@mail.ru", "8(495)888-45-25", 32000f, 1995);

        System.out.println("Информация о сотрудниках старше 40 лет:");
        for (Employee employee : employeesArray ) {
            if (employee.getAge() >= 40) {
                System.out.println(employee.getFullInfo());
            }
        }


        System.out.println("\nСписок сотрудников младше 40 лет:");
        for (Employee employee : employeesArray ) {
            if (employee.getAge() < 40) {
                System.out.println(employee.getInfo());
            }
        }

    }
}
