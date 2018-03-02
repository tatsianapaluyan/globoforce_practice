package plantModel;

import plant.CategoryName;
import plant.PlantName;
import util.LeavesFall;

import java.util.List;

public abstract class Plant implements LeavesFall {

    private CategoryName categoryName;
    private PlantName plantName;
    private double height;
    private double width;
    private int frequencyOfWatering;
    private String typeOfTree;


    public Plant(CategoryName categoryName, PlantName plantName, double height, double width) {

        this.categoryName = categoryName;
        this.plantName = plantName;
        this.height = height;
        this.width = width;
    }

    public Plant(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering) {
        this.categoryName = categoryName;
        this.plantName = plantName;
        this.height = height;
        this.width = width;
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public Plant() {
    }

    public Plant(Plant plant) {
    }

    public PlantName getPlantName() {
        return plantName;
    }

    public double getHeight() {
        return height;
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }


    public String toString() {
        return ("Plant name: " + this.plantName + ", with height " + this.height + ", width " + this.width +
                " and frequency of watering " + this.frequencyOfWatering + "(Category type " + this.categoryName + ")");

    }


    public String getTypeOfTree() {
        return typeOfTree;
    }

    public void setTypeOfTree(String typeOfTree) {
        this.typeOfTree = typeOfTree;
    }

    public abstract List<Plant> isLeavesFall();
}
