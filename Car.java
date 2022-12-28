import java.util.Objects;

public class Car {
    private final String brand;
    private final String model;
    private final double engineVolume;
    private final String color;
    private final int productionYear;
    private final String productionCountry;
    public Car (String brand, String model, int productionYear, String color,  String productionCountry, double engineVolume){
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public String getBrand(){
        return brand;
    }
    public String setBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String setModel() {
        return model;
    }
    public double getEngineVolume() {
        return engineVolume;
    }
    public double setEngineVolume() {
        return engineVolume;
    }
    public String getColor() {
        return color;
    }
    public String setColor() {
        return color;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public int setProductionYear() {
        return productionYear;
    }
    public String getProductionCountry() {
        return productionCountry;
    }
    public String setCountry() {
        return productionCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && productionYear == car.productionYear && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(productionCountry, car.productionCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, color, productionYear, productionCountry);
    }

    @Override
    public String toString() {
        return brand + " " + model + ", год выпуска: " + productionYear + ", страна сборки: " + productionCountry +
                ", цвет кузова: " + color + ", объём двигателя - " + engineVolume + " л.";
    }
}