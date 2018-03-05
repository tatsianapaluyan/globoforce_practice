package plantModel;


import plantData.CategoryName;
import plantData.PlantName;

import java.util.ArrayList;
import java.util.List;

public class Tree extends Plant {

    private int age;

    public Tree(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, int age) {
        super(categoryName, plantName, height, width, frequencyOfWatering);
        this.age = age;
    }

    public Tree(CategoryName categoryName, PlantName plantName, double height, double width) {
        super(categoryName, plantName, height, width);
    }

    public Tree() {
    }

    @Override
    public boolean isLeavesFall() {
        return false;
    }

}




