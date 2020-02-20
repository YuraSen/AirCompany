package ua.mycompany.controller;

import ua.mycompany.model.CargoPlane;
import ua.mycompany.model.PassengerPlane;
import ua.mycompany.model.airport.AirCompany;
import ua.mycompany.util.parse.FileParser;

import java.util.List;

public class InitData {

    public static AirCompany initAirCompany(String passengerPlaneFileName, String cargoPlaneFileName){
        List<PassengerPlane> passengerPlanes = FileParser.parseCSVPassengerPlaneFile(passengerPlaneFileName);
        List<CargoPlane> cargoPlanes = FileParser.parseCSVCargoPlaneFile(cargoPlaneFileName);
        AirCompany airCompany = new AirCompany();
        for (PassengerPlane passengerPlane : passengerPlanes) {
            airCompany.addPassengerPlanes(passengerPlane);
        }
        for (CargoPlane cargoPlane : cargoPlanes) {
            airCompany.addCargoPlanes(cargoPlane);
        }
        return airCompany;
    }
}
