package ua.mycompany.controller;

import ua.mycompany.model.*;
import ua.mycompany.util.localization.UTF8Control;

import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    private static ResourceBundle lang;
    private static Scanner in = new Scanner(System.in);
    private static AirCompany aircompany;

    private static void init() {
        aircompany = new AirCompany();
        BusinessPlane businessPlane = new BusinessPlane(1000, 5, 40, 800);
        CargoPlane cargoPlane = new CargoPlane(2000, 2, 200, 1000);
        PassengerPlane passengerPlane = new PassengerPlane(1500, 50, 30, 900);
        aircompany.add(businessPlane);
        aircompany.add(cargoPlane);
        aircompany.add(passengerPlane);
    }

    public static void main(String[] args) {
        init();
        chooseMenuLang();
    }

    private static void chooseMenuLang() {
        System.out.println("\nChoose language/Оберіть мову");
        System.out.println("English (1)");
        System.out.println("Українська (2)");
        int chooseLanguage = in.nextInt();
        chooseLang(chooseLanguage);
    }

    private static void chooseLang(int chooseLanguage) {

        try {
            if (chooseLanguage == 1) {
                lang = ResourceBundle.getBundle("resources", new Locale("en"), new UTF8Control());
            } else if (chooseLanguage == 2) {
                lang = ResourceBundle.getBundle("resources", new Locale("ua"), new UTF8Control());
            } else
                chooseMenuLang();
        } catch (Exception e) {
            System.out.println(lang.getString("uncorrectedArgument"));
            chooseLang(chooseLanguage);
        }

        menu();
    }


    private static void printPlanes(ArrayList<Plane> planes) {
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

    private static void menu() {
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
                System.out.println("Sum capacity = " + aircompany.sumOfCapacity());
                break;
            case 4:
                System.out.println("Sum carrying = " + aircompany.sumOfCarring());
                break;
            case 5:
                printPlanes(aircompany.searchElementByFuel(700, 950));
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
