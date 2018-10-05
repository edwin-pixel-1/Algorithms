package com.edwin.cobos.patterns.flyweight;

public class Client {

    public static void main(String[] args) {
        Address address1 = new Address("Street 1", "City 1", "State 1", "1111");
        Customer customer1 = new Customer(1, "Edwin", "Cobos", address1, new HealthProfile());

        Image image = LocationMapImageFactory.getMapImage(address1.getCity(), address1.getCoordinates());
        System.out.println(image);

        Image image2 = LocationMapImageFactory.getMapImage(address1.getCity(), address1.getCoordinates());
        System.out.println(image2);



        Address address2 = new Address("Street 2", "City 2", "State 2", "1112");

        Image image3 = LocationMapImageFactory.getMapImage(address2.getCity(), address2.getCoordinates());
        System.out.println(image3);

        Image image4 = LocationMapImageFactory.getMapImage(address2.getCity(), address2.getCoordinates());
        System.out.println(image4);
    }
}
