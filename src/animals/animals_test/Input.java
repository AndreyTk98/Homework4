package animals.animals_test;

import animals.models.Cat;
import animals.models.Dog;

import java.util.Scanner;

public class Input {
    private double run;
    double swim;
    String name;
    Cat cat;
    Dog dog;

    public Input(double run, double swim, String name, Cat cat, Dog dog) {
        this.run = run;
        this.swim = swim;
        this.name = name;
        this.cat = cat;
        this.dog = dog;
    }

    protected void inputAnimals(){
        String title;
        Scanner scanner = new Scanner(System.in);

        title = "Кличка пса:";
        System.out.println(title);
        name = scanner.next();
        dog.setName(name);

        title = "Кличка кота:";
        System.out.println(title);
        name = scanner.next();
        cat.setName(name);

        title = "Длинна маршрута по суше(м):";
        System.out.println(title);
        run = scanner.nextDouble();
        dog.setRun(run);
        cat.setRun(run);

        title = "Ширина водяного препятствия(м)";
        System.out.println(title);
        swim = scanner.nextDouble();
        dog.setSwim(swim);
        cat.setSwim(swim);
        scanner.close();
    }
}
