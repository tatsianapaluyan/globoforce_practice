package plantModel;

import plant.CategoryName;
import plant.PlantName;

import java.util.List;

public class Bush extends Plant {

    private boolean dry;


    public Bush(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, boolean dry) {
        super(categoryName, plantName, height, width, frequencyOfWatering);
        this.dry = dry;
    }

    public Bush(CategoryName categoryName, PlantName plantName, double height, double width) {
        super(categoryName, plantName, height, width);
    }

    public List<Plant> isLeavesFall() {
        return null;
    }

    public boolean isDry() {
        return dry;
    }

    public void setDry(boolean dry) {
        this.dry = dry;
    }


}

