package com.edwin.cobos.patterns.prototype;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "E1", "LAST", "Street", "City", "State", "12345", null, null);
        Employee s1 = new Employee(2, "S1", "LAST", "Street", "City", "State", "12345", null, null);
        Employee ceo = new Employee(3, "CEO", "LAST", "Street", "City", "State", "12345", null, null);

        e1.setSupervisor(s1);

        Employee[] staff1 = {e1};
        s1.setStaff(staff1);
        s1.setSupervisor(ceo);

        Employee[] staff2 = {s1};
        ceo.setStaff(staff2);

        Employee newCeo = null;
        newCeo = (Employee) ceo.clone();

        Employee[] array = newCeo.getStaff();
        System.out.println(array[0]);

        System.out.println(ceo.toString());
        System.out.println(newCeo.toString());

        Employee newE1 = (Employee) e1.clone();
        System.out.println(e1.toString());
        System.out.println(newE1.toString());

        Employee newE1serialize = e1.cloneBySerialization();
        System.out.println(newE1serialize.toString());
    }

}
