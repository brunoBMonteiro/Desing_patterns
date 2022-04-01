package criacionais.builderexemple.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Av. Industrial Belgraf, 865 - Bairro Industrial, Eldorado do Sul";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
