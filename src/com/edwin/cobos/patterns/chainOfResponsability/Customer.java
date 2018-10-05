package com.edwin.cobos.patterns.chainOfResponsability;

public class Customer {

    private String firstName;
    private String lastName;
    private Address address;
    private String phone;
    private String email;

    public Customer(String firstName, String lastName, Address address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValid() {
        return !phone.isEmpty() && !email.isEmpty() && address.isValid();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----Customer----");
        sb.append("\n\t");
        sb.append("First Name: ");
        sb.append(firstName);
        sb.append("\n\t");
        sb.append("Last Name: ");
        sb.append(lastName);
        sb.append("\n\t");
        sb.append("Phone: ");
        sb.append(phone);
        sb.append("\n\t");
        sb.append("Email:");
        sb.append(email);
        sb.append("\n\t");
        sb.append("Address: ");
        sb.append(address.toString());
        sb.append("\n\t");
        sb.append("----End-Customer----");
        return sb.toString();
    }
}
