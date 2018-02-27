package tree;

import plant.Plant;

public class Tree extends Plant {

    private int age;

    public Tree(String categoryName, String plantName, double height, double width, int frequencyOfWatering, int age) {
        super(categoryName, plantName, height, width, frequencyOfWatering);
        this.age = age;
    }

    public Tree(String categoryName, String plantName, double height, double width) {
        super(categoryName, plantName, height, width);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

