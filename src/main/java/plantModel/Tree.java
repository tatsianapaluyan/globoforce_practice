package plantModel;


import plant.CategoryName;
import plant.PlantName;
import java.util.ArrayList;
import java.util.List;

public class Tree extends Plant {

    private int age;
    private List<Plant> conifers = new ArrayList<Plant>();
    private List<Plant> leafy = new ArrayList<Plant>();

    public Tree(CategoryName categoryName, PlantName plantName, double height, double width, int frequencyOfWatering, int age) {
        super(categoryName, plantName, height, width, frequencyOfWatering);
        this.age = age;
    }

    public Tree(CategoryName categoryName, PlantName plantName, double height, double width) {
        super(categoryName, plantName, height, width);
    }

    public Tree() {
        super();
    }

    public Tree(Plant plant, List<Plant> conifers) {
        super(plant);
        this.conifers = conifers;
    }
//    public Tree(Plant plant, List<Plant> leafy) {
//        super(plant;
//        this.leafy = leafy;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public List<Plant> isLeavesFall() {
        for (Plant greens : leafy)
            if (getTypeOfTree().equals("Leaves")) {
                System.out.println("Plant with Leaves" + getPlantName());
                return leafy;
            } else {
                System.out.println("Plant with needles" + getPlantName());
            }
        return conifers;
    }
}



