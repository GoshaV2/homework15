package transport;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car {
    public static class Key {
        private boolean hasRemoteEngineStart;
        private boolean hasKeylessEntry;

        public Key(boolean hasRemoteEngineStart, boolean hasKeylessEntry) {
            this.hasRemoteEngineStart = hasRemoteEngineStart;
            this.hasKeylessEntry = hasKeylessEntry;
        }

        public boolean isHasRemoteEngineStart() {
            return hasRemoteEngineStart;
        }

        public boolean isHasKeylessEntry() {
            return hasKeylessEntry;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "hasRemoteEngineStart=" + hasRemoteEngineStart +
                    ", hasKeylessEntry=" + hasKeylessEntry +
                    '}';
        }
    }

    public static class Insurance {
        private int yearOfEnding;
        private double cost;
        private String numberInsurance;

        public Insurance(int yearOfEnding, double cost, String numberInsurance) {
            this.yearOfEnding = yearOfEnding > 0 ? yearOfEnding : 2000;
            this.cost = cost <= 0 ? 1 : cost;
            if (numberInsurance.length() == 9) {
                this.numberInsurance = numberInsurance;
            } else {
                this.numberInsurance = "Номер страховки некорректный!";
                System.out.println("Номер страховки некорректный!");
            }

        }

        public void checkYearOfEnding(int currentYear) {
            if (currentYear > yearOfEnding) {
                System.out.println("срочно ехать оформлять новую страховку");
            }
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "yearOfEnding=" + yearOfEnding +
                    ", cost=" + cost +
                    ", numberInsurance='" + numberInsurance + '\'' +
                    '}';
        }
    }

    private String brand;
    private String model;
    private double volumeEngine;
    private String color;
    private int yearCreation;
    private String country;
    private String transmission;
    private String typeBody;
    private String regNumber;
    private int countPlace;
    private String typeRubber;

    public Car(String brand, String model, int yearCreation, String country, String typeBody, int countPlace) {
        this.brand = brand == null || brand.equals("") ? "default" : brand;
        this.model = model == null || model.equals("") ? "default" : model;
        this.yearCreation = yearCreation <= 0 ? 2000 : yearCreation;
        this.country = country == null || country.equals("") ? "default" : country;
        this.typeBody = typeBody == null || typeBody.equals("") ? "default" : typeBody;
        this.countPlace = countPlace <= 0 ? 1 : countPlace;
        this.volumeEngine = 1.5;
        this.color = "белый";
        this.transmission = "механика";
        this.regNumber = "нету номера";
        this.typeRubber = "летняя";
    }

    public Car(String brand, String model, double volumeEngine, String color, int yearCreation, String country, String transmission, String typeBody, String regNumber, int countPlace, String typeRubber) {
        this(brand, model, yearCreation, country, typeBody, countPlace);
        this.volumeEngine = volumeEngine <= 0 ? 1.5 : volumeEngine;
        this.color = color == null || color.equals("") ? "белый" : color;
        this.transmission = transmission == null || transmission.equals("") ? "механика" : transmission;
        this.regNumber = checkRegNumber(regNumber) ? regNumber : "нету номера";
        this.typeRubber = typeRubber == null || typeRubber.equals("") ? "летняя" : typeRubber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearCreation() {
        return yearCreation;
    }

    public String getCountry() {
        return country;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public int getCountPlace() {
        return countPlace;
    }

    public double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(double volumeEngine) {
        this.volumeEngine = volumeEngine <= 0 ? this.volumeEngine == 0 ? 1.5 : this.volumeEngine : volumeEngine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null || color.equals("") ? this.color == null ? "белый" : this.color : color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission == null || transmission.equals("") ? this.transmission == null ? "механика" : this.transmission : "автомат";
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = checkRegNumber(regNumber) ? regNumber : this.regNumber == null ? "нету номера" : this.regNumber;
    }

    public String getTypeRubber() {
        return typeRubber;
    }

    public void setTypeRubber(String typeRubber) {
        this.typeRubber = typeRubber == null || typeRubber.equals("") ? this.typeRubber == null ? "летняя" : this.typeRubber : typeRubber;
    }

    private boolean checkRegNumber(String regNumber) {
        Pattern pattern = Pattern.compile("\\S{1}\\d{3}\\S{2}\\d{3}");
        Matcher matcher = pattern.matcher(regNumber);
        return matcher.matches();
    }

    public void setSeasonalRubber() {
        if (typeRubber.equals("летняя")) {
            typeRubber = "зимняя";
        } else if (typeRubber.equals("зимняя")) {
            typeRubber = "летняя";
        } else {
            typeRubber = "летняя";
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volumeEngine=" + volumeEngine +
                ", color='" + color + '\'' +
                ", yearCreation=" + yearCreation +
                ", country='" + country + '\'' +
                ", transmission='" + transmission + '\'' +
                ", typeBody='" + typeBody + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", countPlace=" + countPlace +
                ", typeRubber='" + typeRubber + '\'' +
                '}';
    }
}
