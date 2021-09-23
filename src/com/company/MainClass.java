package com.company;

import java.text.MessageFormat;

/*public class MainClass {
    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Ivanov", "ivanov@mail.ru", 45);
        employees[1] = new Employees("Ivanov1", "ivanov@mail.ru", 36);
        employees[2] = new Employees("Ivanov2", "ivanov@mail.ru", 52);
        employees[3] = new Employees("Ivanov3", "ivanov@mail.ru", 27);
        employees[4] = new Employees("Ivanov4", "ivanov@mail.ru", 48);
        }
    }
*/




//это супер класс, в который входят два подкласса Cat, Dog



//это супер класс, в который входят два подкласса Cat, Dog

class Animal {
    // сдесь задаем одинаковые типы данных для всех животных, индивидуальные навыки(типы данных) задаются в классе для конкретного животного

    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();

    }
}

//**********************CAT****************************
//это подкласс Cat, супер класса Animal с наследованием extends
class Cat extends Animal {

    protected boolean sweem;
    int jump;

//konstruktor Cat

    public Cat(String name, int run, boolean sweem, int jump) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }

    //выводим информацию в консоль
    public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem + " /Jump: " +jump+ " meters/");
    }
}

//***********************DOG****************************
//это подкласс Cat супер класса Animal с наследованием extends
class Dog extends Animal {

    public double jump;
    public int sweem;

    //konstruktor

    public Dog(String name, int run, int sweem, double jump ) {
        this.name = name;
        this.run = run;
        this.sweem = sweem;
        this.jump = jump;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + " /RunLimit: " + run+ " meters/" + " /Sweem:" + sweem + " /Jump: " +jump+ " meters/");
    }
}

public class MainClass {
    public static void main(String[] args) {

        Animal animal = new Animal("CatsCategory");
        Cat cat = new Cat("Barsik", 200, false, 2);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Sharik", 500, 10, 0.5);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}