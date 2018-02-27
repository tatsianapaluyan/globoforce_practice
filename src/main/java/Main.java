import plant.Plant;
import util.Park;
import util.PlantAgarden;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        PlantAgarden plantAgarden = new PlantAgarden();

        Park mixedPark = plantAgarden.mixedPark() ;

        System.out.println(mixedPark);
    }

    }
