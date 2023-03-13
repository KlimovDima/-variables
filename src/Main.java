public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4 () {
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Task 6-7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var summaryWeight = weightBoxer1 + weightBoxer2;
        var weightDifference = weightBoxer2 % weightBoxer1;
        var weightDifference1 = weightBoxer2 - weightBoxer1;
        System.out.println("Общий вес боксёров: " + summaryWeight + " кг");
        System.out.println("Разница в весе боксёров составляет:(при вычитании) " + weightDifference1 + " кг");
        System.out.println("Разница в весе боксёров составляет:(при остатке от деления) " + weightDifference + " кг");
    }
    public static void task7 () {
        System.out.println("Task 7");
        var timeWork = 640;
        var timeHuman = 8;
        var human = timeWork / timeHuman;
        System.out.println("Всего работников в компании — " + human + " человек");
        var humanAdd = human + 94;
        var timeWorknew = humanAdd * timeHuman;
        System.out.println("Если в компании работает " + humanAdd + " человека, то всего " + timeWorknew + " часов работы может быть поделено между сотрудниками");
    }
}