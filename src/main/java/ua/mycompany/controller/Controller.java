package ua.mycompany.controller;

import ua.mycompany.model.*;
import ua.mycompany.model.airport.AirCompany;
import ua.mycompany.util.localization.UTF8Control;
import ua.mycompany.view.Constant;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    private ResourceBundle lang;
    private Scanner in = new Scanner(System.in);
    private AirCompany aircompany;

    public Controller(AirCompany aircompany) {
        this.aircompany = aircompany;
    }

    public void processUser() {
        aircompany = InitData.initAirCompany(Constant.FILE_NAME_PASSENGER, Constant.FILE_NAME_CARGO);
        chooseMenuLang();
    }

    private void chooseMenuLang() {
        System.out.println("\nChoose language/Оберіть мову");
        System.out.println("English (1)");
        System.out.println("Українська (2)");
        int chooseLanguage = in.nextInt();
        chooseLang(chooseLanguage);
    }

    private void chooseLang(int chooseLanguage) {
        if (chooseLanguage == 1) {
            lang = ResourceBundle.getBundle("resources", new Locale("en"), new UTF8Control());
        } else if (chooseLanguage == 2) {
            lang = ResourceBundle.getBundle("resources", new Locale("ua"), new UTF8Control());
        } else
            chooseMenuLang();
        menu();
    }


    private void printPlanes(List<Plane> planes) {
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

    private void menu() {
        System.out.println(lang.getString("menu"));
        System.out.println("1 - " + lang.getString("viewAllPlanes"));
        System.out.println("2 - " + lang.getString("sortByDistance"));
        System.out.println("3 - " + lang.getString("sumCapacity"));
        System.out.println("4 - " + lang.getString("sumCarrying"));
        System.out.println("5 - " + lang.getString("rangeFuel"));
        System.out.println("6 - " + lang.getString("chooseLanguage"));
        System.out.println("7 - " + lang.getString("exit"));

        int choice;
        try {
            choice = in.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException(lang.getString("uncorrectedArgument"));
        }

        switch (choice) {
            case 1:
                printPlanes(aircompany.getPlanes());
                break;
            case 2:
                printPlanes(aircompany.sortByDistance());
                break;
            case 3:
                System.out.println("Sum capacity = " + aircompany.sumOfCapacityPassengerPlane());
                break;
            case 4:
                System.out.println("Sum carrying = " + aircompany.sumOfCarryingCargoPlane());
                break;
            case 5:
                printPlanes(aircompany.searchElementByFuel(450, 550));
                break;
            case 6:
                chooseMenuLang();
                break;
            case 7:
                System.exit(0);
        }
        menu();
    }
}
