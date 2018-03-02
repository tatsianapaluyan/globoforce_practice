package plantModel;

import plant.CategoryName;
import plant.PlantName;

public class Leafy extends Tree {

    private String leaf;

    public Leafy(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, int age) {
        super(categoryName, plantName, height, width, frequencyOfWatering, age);
    }

    public Leafy(CategoryName categoryName, PlantName plantName, double height, double width, String leaf) {
        super(categoryName, plantName, height, width);
        this.leaf = leaf;
    }

    public String isLeaf() {
        return leaf;
    }

    public void setLeaf(String leaf) {
        this.leaf = leaf;
    }

}
