package ru.gb.lesson3;

public class Worker extends Employee {


    public Worker(String name, String post, int age, double fixed_rate, int work_days ){

        super.name = name;
        super.post = post;
        super.age = age;
        super.fixed_rate = fixed_rate;
        super.work_days = work_days;
    }
}