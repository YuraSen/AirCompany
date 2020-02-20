package ua.mycompany;

import ua.mycompany.controller.Controller;
import ua.mycompany.model.airport.AirCompany;

public class Main {
    public static void main(String[] args) {
        AirCompany airCompany = new AirCompany();
        Controller controller = new Controller(airCompany);
        controller.processUser();
    }
}
