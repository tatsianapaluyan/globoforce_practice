
import plantModel.Bush;
import plant.CategoryName;
import plant.PlantName;
import plantModel.Conifers;
import plantModel.Leafy;
import plantModel.Tree;
import util.Park;

public class Main {
    public static void main(String[] args) {


        Park mixedPark = new Park();


        System.out.println(mixedPark);

        mixedPark.addPlants(new Conifers (CategoryName.TREE, PlantName.FIR, 1,200, 2,2, "Smels"));
        mixedPark.addPlants(new Conifers(CategoryName.TREE, PlantName.PINE, 1, 200, 2, 2));

        mixedPark.addPlants(new Leafy(CategoryName.TREE, PlantName.BIRCH, 200, 100, 1, 1));
        mixedPark.addPlants(new Leafy (CategoryName.TREE, PlantName.OAK, 3000, 100, 3, 1));

        mixedPark.addPlants(new Bush (CategoryName.BUSH, PlantName.LILAC, 100, 50, 2, true));
        mixedPark.addPlants(new Bush (CategoryName.BUSH, PlantName.HYDRANGEA, 100, 50, 2, false));

        System.out.println("\n" + "Sorting of Plants By height: ");
        mixedPark.sortResults();
        System.out.println("\n" + "Find Plant by range: ");
        mixedPark.findPlantByRange();
        System.out.println("\n" + "Count the height of all Plants: ");
        mixedPark.countHeight();


          Tree tree = new Tree();
          tree.isLeavesFall();



//        for (int i = 0; i < 6; i++) {
//            switch (i) {
//                case 1:
//                    System.out.println("Bush Park");
//                    System.out.println(mixedPark.addPlants(Plant p));
//                    break;
//                case 2:
//
//                    break;
//
    }
    }
