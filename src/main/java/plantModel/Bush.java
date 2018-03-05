package plantModel;

import plantData.CategoryName;
import plantData.PlantName;

public class Bush extends Plant {

    private boolean dry;


    public Bush(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, boolean dry) {
        super(categoryName, plantName, height, width, frequencyOfWatering);
        this.dry = dry;
    }

    @Override
    public boolean isLeavesFall() {
        return false;
    }

}

