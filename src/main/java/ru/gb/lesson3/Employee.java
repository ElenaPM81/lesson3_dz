package ru.gb.lesson3;

public  abstract class Employee {


    String name;
    String post;
    int age;
    double fixedSalary;
    double workedHours;
    double fixed_rate;
    int work_days;
    double hourly_rate;

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getAge() {
        return age;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getFoolHoursSalary() {
        return 20.8 * 8 * hourly_rate;
    }

    public double getFoolSalary() {
        return fixed_rate * work_days;
    }
}