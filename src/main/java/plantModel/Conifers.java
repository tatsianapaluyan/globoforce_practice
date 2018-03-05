package plantModel;

import plantData.CategoryName;
import plantData.PlantName;

public class Conifers extends Tree {

    private String needles;


    public Conifers(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, int age, String needles) {
        super(categoryName, plantName, height, width, frequencyOfWatering, age);
        this.needles = needles;
    }

    public Conifers(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, int age) {
        super(categoryName, plantName, height, width, frequencyOfWatering, age);
    }

    public Conifers() {
    }

    @Override
    public boolean isLeavesFall() {
        {
            System.out.println("Сoniferous plant has no leaves " + getPlantName());
        }
        return false;
    }
}
