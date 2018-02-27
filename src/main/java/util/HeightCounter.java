package util;

import plant.Plant;

import java.util.Comparator;

    public class HeightCounter implements Comparator<Plant> {
        public int compare(Plant p1, Plant p2) {
            return (int) (p1.getHeight() - p2.getHeight());
        }
    }

