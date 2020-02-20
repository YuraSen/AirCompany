package ua.mycompany.controller;

import ua.mycompany.model.airport.AirCompany;
import ua.mycompany.util.localization.Localization;
import ua.mycompany.view.Constant;
import ua.mycompany.view.View;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller {
    private ResourceBundle lang;
    private Scanner in = new Scanner(System.in);
    private AirCompany aircompany;
    private View view;

    public Controller() {
        view = new View();
    }

    public void processUser() {
        aircompany = InitData.initAirCompany(Constant.FILE_NAME_PASSENGER, Constant.FILE_NAME_CARGO);
        chooseMenuLang();
    }

    private void chooseMenuLang() {
        view.chooseMenuLang();
        int chooseLanguage = in.nextInt();
        chooseLang(chooseLanguage);
    }

    private void chooseLang(int chooseLanguage) {
        if (chooseLanguage == 1) {
            lang = ResourceBundle.getBundle("resources", new Locale("en"), new Localization());
        } else if (chooseLanguage == 2) {
            lang = ResourceBundle.getBundle("resources", new Locale("ua"), new Localization());
        } else
            chooseMenuLang();
        menu();
    }

    private void menu() {
        view.printMenu(lang);
        int choice;
        try {
            choice = in.nextInt();
        } catch (Exception e) {
            throw new IllegalArgumentException(lang.getString("uncorrectedArgument"));
        }

        switch (choice) {
            case 1:
                view.printPlanes(aircompany.getPlanes(), lang);
                break;
            case 2:
                view.printPlanes(aircompany.sortByDistance(), lang);
                break;
            case 3:
                view.printSumCapacity(aircompany, lang);
                break;
            case 4:
                view.printSumCarrying(aircompany, lang);
                break;
            case 5:
                view.printPlanes(aircompany.searchElementByFuel(450, 550), lang);
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
