package bush;

import plant.Plant;

public class Bush extends Plant {

    private boolean dry;
    private boolean bloom;


    public Bush(String categoryName, String plantName, double height, double width, int frequencyOfWatering, boolean dry) {
        super(categoryName, plantName, height, width, frequencyOfWatering);
        this.dry = dry;
    }

    public Bush(String categoryName, String plantName, double height, double width) {
        super(categoryName, plantName, height, width);
    }

    public Bush(String categoryName, String plantName, boolean bloom) {
        super(categoryName, plantName);
        this.bloom = bloom;
    }


    public boolean isDry() {
        return dry;
    }

    public void setDry(boolean dry) {
        this.dry = dry;
    }



}

