package com.edwin.cobos.patterns.flyweight;

public class Customer {

    private int customerId;
    private String firstName;
    private String lastName;
    private Address residenceAddress;
    private HealthProfile profile;
    //city map with a red dot representing residence location
    private Image locationMap;

    public Customer(int customerId, String firstName, String lastName, Address residenceAddress, HealthProfile profile) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.residenceAddress = residenceAddress;
        this.profile = profile;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(Address residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public HealthProfile getProfile() {
        return profile;
    }

    public void setProfile(HealthProfile profile) {
        this.profile = profile;
    }

    public Image getLocationMap() {
        return locationMap;
    }

    public void setLocationMap(Image locationMap) {
        this.locationMap = locationMap;
    }
}
