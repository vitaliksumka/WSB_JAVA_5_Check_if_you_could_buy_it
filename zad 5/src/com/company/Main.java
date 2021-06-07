package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        Human me = new Human();
        me.firstName = "Vitalii";
        me.lastName = "Sumka";
        me.pet = new Animal("Dog");
        me.pet.name = "Emma";
        me.getLastSalaryCheckInfo();
        System.out.println("First salary check. Salary: " + me.getSalary());
        me.getLastSalaryCheckInfo();
        me.setSalary(3500.0);
        me.setCar(new Car("BMW", "3 series"));
        System.out.println(me.getCar().producer + " " + me.getCar().model);

        me.pet.takeForAWalk();
                me.pet.takeForAWalk();
                me.pet.takeForAWalk();
                me.pet.feed();
                me.pet.takeForAWalk();
                me.pet.takeForAWalk();
                me.pet.takeForAWalk();
                }
                }
