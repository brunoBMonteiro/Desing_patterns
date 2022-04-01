package criacionais.builderexemple.cars;

import criacionais.builderexemple.components.Engine;
import criacionais.builderexemple.components.GPSNavigator;
import criacionais.builderexemple.components.Transmission;
import criacionais.builderexemple.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Tipo de carro: " + carType + "\n";
        info += "Contagem de assentos: " + seats + "\n";
        info += "Motor: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmissão: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Computador de bordo: Funcional" + "\n";
        } else {
            info += "Computador de bordo: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "Navegador GPS: Funcional" + "\n";
        } else {
            info += "Navegador GPS: N/A" + "\n";
        }
        return info;
    }
}
