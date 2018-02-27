package plant;

public abstract class Plant {

    private String categoryName;
    private String plantName;
    private double height;
    private double width;
    private int frequencyOfWatering;

    public Plant(String categoryName, String plantName, double height, double width) {

        this.categoryName = categoryName;
        this.plantName = plantName;
        this.height = height;
        this.width = width;
    }

    public Plant(String categoryName, String plantName, double height, double width, int frequencyOfWatering) {
        this.categoryName = categoryName;
        this.plantName = plantName;
        this.height = height;
        this.width = width;
        this.frequencyOfWatering = frequencyOfWatering;
    }

    public Plant(String categoryName, String plantName) {
        this.categoryName = categoryName;
        this.plantName = plantName;
    }

    public Plant(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getFrequencyOfWatering() {
        return frequencyOfWatering;
    }

    public void setFrequencyOfWatering(int frequencyOfWatering) {
        this.frequencyOfWatering = frequencyOfWatering;
    }

    //  public double getTotalHeight() {
    // return height * plantCount;
    //}

    public String toString() {
        return (this.width + " width of " + this.plantName + "(" + this.categoryName + " " + this.height + "height)");
    }
}
