package util;

import plant.Plant;

import java.util.*;

public class Park {

    private String name;
    private List<Plant> green = new ArrayList<Plant>();

    public Park() {
        name = "Gorky";
    }

    public boolean addPlants(Plant plants) {
        for (Plant greenPlant : green) {
            System.out.println(plants);
        }
        return green.add(plants);
    }

    public String toString() {
        return "Park: " + name + green.toString();
    }

}



