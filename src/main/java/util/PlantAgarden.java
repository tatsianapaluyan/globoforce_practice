package util;

import bush.Bush;
import tree.Conifers;
import tree.Tree;

public class PlantAgarden {


    public Park mixedPark(){
        Park mixedPark  = new Park();

        mixedPark.addPlants(new Conifers("Tree", "Conifers", 400, 200, 2,2));

        return mixedPark;
    }


}
