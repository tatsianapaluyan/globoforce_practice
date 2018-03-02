package plantModel;

import plant.CategoryName;
import plant.PlantName;

public class Conifers extends Tree {

    private String needles;

    public Conifers(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, int age, String needles) {
        super(categoryName, plantName, height, width, frequencyOfWatering, age);
        this.needles = needles;
    }

    public Conifers(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, int age) {
        super(categoryName, plantName, height, width, frequencyOfWatering, age);
    }


    //override parent's method getTypeOfTree
    @Override
    public String getTypeOfTree() {
        return super.getTypeOfTree();
    }

    public String getNeedles() {
        return needles;
    }

    public void setNeedles(String needles) {
        this.needles = needles;
    }
}
