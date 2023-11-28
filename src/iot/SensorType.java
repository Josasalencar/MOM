package iot;

public enum SensorType {
    TEMPERATURA("TEMPERATURA", "°C"),
    UMIDADE("UMIDADE", "%"),
    VELOCIDADE("VELOCIDADE", "km/h");
    private String unit;
    private String type;

    SensorType(String type, String unit) {

        this.type = type;

        this.unit = unit;
    }
    public String getType() {
        return type;
    }
    public String getUnit() {
        return unit;
    }
}