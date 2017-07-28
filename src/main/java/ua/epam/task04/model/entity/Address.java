package ua.epam.task04.model.entity;

/**
 * Created by Denis Starovoitenko on 28.07.2017.
 */
public class Address {
    private int index;
    private String city;
    private String street;
    private int house;
    private int apartment;

    public Address(){
        this(0, "", "", 0, 0);
    }

    public Address(int index, String city, String street, int house, int apartment) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Full address: " + "(" + String.format("%05d", index) + ") " + city + " st."
                + street + " №" + house + " ap." + apartment;
    }
}
