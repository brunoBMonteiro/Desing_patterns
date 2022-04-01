package criacionais.builderexemple.builders;

import criacionais.builderexemple.cars.CarType;
import criacionais.builderexemple.components.Engine;
import criacionais.builderexemple.components.GPSNavigator;
import criacionais.builderexemple.components.Transmission;
import criacionais.builderexemple.components.TripComputer;

public interface Builder {

    //A interface do Builder define todas as formas possíveis de configurar um produto.

    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
