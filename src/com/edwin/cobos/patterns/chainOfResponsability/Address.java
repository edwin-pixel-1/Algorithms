package com.edwin.cobos.patterns.chainOfResponsability;

public class Address {

    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;

    public Address(String streetAddress, String city, String state, String zipcode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public boolean isValid() {
        return !streetAddress.isEmpty() && !city.isEmpty() && !state.isEmpty() && !zipcode.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----Address----");
        sb.append("\n\t");
        sb.append("Street address: ");
        sb.append(streetAddress);
        sb.append("\n\t");
        sb.append("City: ");
        sb.append(city);
        sb.append("\n\t");
        sb.append("City: ");
        sb.append(city);
        sb.append("\n\t");
        sb.append("State: ");
        sb.append(state);
        sb.append("\n\t");
        sb.append("Zip code: ");
        sb.append(zipcode);
        sb.append("\n\t");
        sb.append("----End-Address----");
        return sb.toString();
    }
}
