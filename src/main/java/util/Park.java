package util;

import plantModel.Bush;
import plantModel.Plant;

import java.util.*;

public class Park implements AddPlants {

    private String name;
    private List<Plant> green = new ArrayList<Plant>();


    public Park() {
        name = "Gorky contains next plants:";
            }

    public boolean addPlants(Plant plants) {
        System.out.println(plants);
        return green.add(plants);
    }

    public String toString() {
        return "Park " + name + green.toString();
    }


    public List<Plant> sortResults() {
        HeightCounter heightCounter = new HeightCounter();
        Collections.sort(green, heightCounter);
        for (Plant plant : green) {
            System.out.println(plant.getPlantName() + " " + plant.getHeight());
        }
        return green;
    }

    public List<Plant> findPlantByRange() {
        List<Plant> range = new ArrayList<Plant>();
        for (Plant plant : green) {
            if (plant.getFrequencyOfWatering() > 1 && plant.getHeight() > 2000) {
                range.add(plant);
                System.out.println(range);
            }
//            else {
//            System.out.println("nothing to add ");
//            }
        }
        return range;
    }


    public double countHeight() {
        double height = 0.0;
        for (Plant plant : green) {
            height += plant.getHeight();
        }
        System.out.println("Total height: " + height + " cm");
        return height;
    }
}
