package web.model;

public class Car {
    private String name;
    private int yearOfRelease;
    private String color;

    public Car(String name, int yearOfRelease, String color) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", color='" + color + '\'' +
                '}';
    }
}
