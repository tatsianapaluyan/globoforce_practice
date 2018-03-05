package util;

import exceptions.HeightException;
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
        return "Park " + name;
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
        int count = 1;
        for (Plant plant : green) {
            if (plant.getFrequencyOfWatering() > 1 && plant.getHeight() > 2100) {
                range.add(plant);
                System.out.println(range);
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Nothing to add");
        }
        return range;
    }


    public double countHeight(int plantHeightLimit) throws HeightException {
        double height = 0.0;
        for (Plant plant : green) {
            height += plant.getHeight();
        }
        System.out.println("Total height: " + height + " cm");
        if (height > plantHeightLimit) {
            throw new HeightException();
        }
        return height;
    }
}
