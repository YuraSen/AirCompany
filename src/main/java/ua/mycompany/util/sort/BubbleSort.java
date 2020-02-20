package ua.mycompany.util.sort;

import ua.mycompany.model.Plane;

import java.util.Collections;
import java.util.List;

public class BubbleSort {

    public static void sort(List<Plane> planes) {

        for (int i = 0; i < planes.size() - 1; i++) {
            for (int j = 0; j < planes.size() - i - 1; j++) {
                if (planes.get(j).compareTo(planes.get(j + 1)) > 0) {
                    swap(planes, j, j + 1);
                }
            }
        }
    }

    private static void swap(List<Plane> planes, int i, int j) {
        Collections.swap(planes, i, j);
    }
}
