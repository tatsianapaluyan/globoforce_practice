
import plantModel.*;
import plantData.CategoryName;
import plantData.PlantName;
import util.LeavesFall;
import util.Park;
import exceptions.HeightException;

public class Main {
    public static void main(String[] args) throws HeightException {


        Park mixedPark = new Park();

        System.out.println(mixedPark);

        mixedPark.addPlants(new Conifers(CategoryName.TREE, PlantName.FIR, 1000, 100, 4, 2, "Smels"));

        mixedPark.addPlants(new Conifers(CategoryName.TREE, PlantName.PINE, 2100, 200, 2, 2));

        mixedPark.addPlants(new Leafy(CategoryName.TREE, PlantName.BIRCH, 1000, 150, 2, 1, "green"));
        mixedPark.addPlants(new Leafy(CategoryName.TREE, PlantName.OAK, 3000, 300, 3, 1, "yellow"));

        mixedPark.addPlants(new Bush(CategoryName.BUSH, PlantName.LILAC, 100, 50, 5, true));
        mixedPark.addPlants(new Bush(CategoryName.BUSH, PlantName.HYDRANGEA, 100, 50, 2, false));


        System.out.println("\n" + "Sorting of Plants By height: ");
        mixedPark.sortResults();
        System.out.println("\n" + "Find Plant by range: ");
        mixedPark.findPlantByRange();
        System.out.println("\n" + "Count the height of all Plants: ");
        try {
            mixedPark.countHeight(1000);
        } catch (HeightException e) {
            System.out.println("Limit has been exceeded, " + e.getErrorCode());
        }


        Conifers conifers = new Conifers();
        System.out.println("\n" + "Have the leaves fallen off?: ");
        conifers.isLeavesFall();
        Leafy leafy = new Leafy();
        leafy.isLeavesFall();

    }
}
