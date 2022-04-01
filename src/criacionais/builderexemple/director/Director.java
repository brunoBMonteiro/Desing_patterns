package criacionais.builderexemple.director;


import criacionais.builderexemple.builders.Builder;
import criacionais.builderexemple.cars.CarType;
import criacionais.builderexemple.components.Engine;
import criacionais.builderexemple.components.GPSNavigator;
import criacionais.builderexemple.components.Transmission;
import criacionais.builderexemple.components.TripComputer;

/**
 Diretor define a ordem das etapas de construção. Funciona com um objeto construtor
 através da interface comum do Builder. Portanto, pode não saber qual é o produto
 sendo construído.
 */

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
