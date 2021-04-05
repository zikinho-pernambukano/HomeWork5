package Hm5;

public class Person {

    String name;
    String position;
    String email;
    int number;
    int theSalary;
    int age;


    public Person(String name, String position, String email, int number, int theSalary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.number = number;
        this.theSalary = theSalary;
        this.age = age;
    }

    public void info(){

        System.out.printf("Name : %s\n  position : %s\n  email: %s\n  number : %d\n  theSalary : %d\n  age : %d", name , position , email , number, theSalary, age );


    }


}
