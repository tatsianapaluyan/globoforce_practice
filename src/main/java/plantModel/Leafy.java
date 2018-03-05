package plantModel;

import plantData.CategoryName;
import plantData.PlantName;

public class Leafy extends Tree {

    private String leaf;

    public Leafy(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, int age, String leaf) {
        super(categoryName, plantName, height, width, frequencyOfWatering, age);
        this.leaf = leaf;
    }

    public Leafy(CategoryName categoryName, PlantName plantName, double height, double width) {
        super(categoryName, plantName, height, width);
    }

    public Leafy() {
    }

    @Override
    public boolean isLeavesFall() {
        if (getFrequencyOfWatering() > 3) {
            System.out.println("The plant is not withered, it is necessary to water");
        } else {
            System.out.println("The 'Leafy' plant withered and the leaves fell down");
        }
        return false;
    }
}
