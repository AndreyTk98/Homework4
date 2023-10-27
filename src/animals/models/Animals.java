package animals.models;

public class Animals {
    private double run;
    private double swim;
    private String name;
    private static int animalCount;

    public Animals(double run, double swim, String name) {
        this.run = run;
        this.swim = swim;
        this.name = name;
        animalCount++;
    }

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }

    public double getSwim() {
        return swim;
    }

    public void setSwim(double swim) {
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalCount() {
        return animalCount;
    }
}
