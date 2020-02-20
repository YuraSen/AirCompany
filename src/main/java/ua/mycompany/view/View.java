package ua.mycompany.view;

import ua.mycompany.model.Plane;
import ua.mycompany.model.airport.AirCompany;

import java.util.List;
import java.util.ResourceBundle;

public class View {

    public void chooseMenuLang() {
        System.out.println("\nChoose language/Оберіть мову");
        System.out.println("English (1)");
        System.out.println("Українська (2)");
    }

    public void printPlanes(List<Plane> planes, ResourceBundle lang) {
        if (planes.isEmpty()) {
            System.out.println(lang.getString("noPlane"));
        } else {
            System.out.println("\n" + lang.getString("listPlane"));
            for (Plane plane : planes
            ) {
                System.out.println(plane);
            }
            System.out.println();
        }
    }

    public void printSumCarrying(AirCompany airCompany, ResourceBundle lang) {
        System.out.println(lang.getString("sumCarrying") + " = " + airCompany.sumOfCarryingCargoPlane());
    }

    public void printSumCapacity(AirCompany airCompany, ResourceBundle lang) {
        System.out.println(lang.getString("sumCapacity") + " = " + airCompany.sumOfCapacityPassengerPlane());
    }

    public void printMenu(ResourceBundle lang) {
        System.out.println(lang.getString("menu"));
        System.out.println("1 - " + lang.getString("viewAllPlanes"));
        System.out.println("2 - " + lang.getString("sortByDistance"));
        System.out.println("3 - " + lang.getString("sumCapacity"));
        System.out.println("4 - " + lang.getString("sumCarrying"));
        System.out.println("5 - " + lang.getString("rangeFuel"));
        System.out.println("6 - " + lang.getString("chooseLanguage"));
        System.out.println("7 - " + lang.getString("exit"));
    }
}
