package com.edwin.cobos.patterns.prototype;

import java.io.*;
import java.util.IdentityHashMap;

public class Employee implements Cloneable, Serializable {

    private int id;
    private String Lastname;
    private String Firstname;
    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;
    private Employee supervisor;
    private Employee staff[];

    public Employee(int id, String lastname, String firstname, String streetAddress, String city, String state, String zipcode, Employee supervisor, Employee[] staff) {
        this.id = id;
        Lastname = lastname;
        Firstname = firstname;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.supervisor = supervisor;
        this.staff = staff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
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

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public Employee[] getStaff() {
        return staff;
    }

    public void setStaff(Employee[] staff) {
        this.staff = staff;
    }

    protected Employee cloneBySerialization() {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (Employee) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }

    @Override
    protected Employee clone() {
        IdentityHashMap<Object, Object> clones = new IdentityHashMap<>();
        Employee newEmployee = deepClone(this, clones);
        clones.clear();
        return newEmployee;
    }

    private Employee createClone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Employee) obj;
    }

    private Employee deepClone(Employee employee, IdentityHashMap<Object, Object> clones) {
        if (!clones.containsKey(employee)) {
            clones.put(employee, employee.createClone());
        }

        Employee clonedEmployee = (Employee) clones.get(employee);

        Employee supervisor = clonedEmployee.getSupervisor();
        if (supervisor != null) {
            if (!clones.containsKey(supervisor)) {
                deepClone(clonedEmployee.getSupervisor(), clones);
            }
            clonedEmployee.setSupervisor((Employee) clones.get(supervisor));
        }

        Employee[] staffList = clonedEmployee.getStaff();
        if (staffList != null) {

            if (!clones.containsKey(staffList)) {
                clones.put(staffList, staffList.clone());
            }

            Employee[] clonedStaffList = (Employee[]) clones.get(staffList);
            for (int i = 0; i < clonedStaffList.length; i++) {
                Employee staffEmp = clonedStaffList[i];
                if (!clones.containsKey(staffEmp)) {
                    deepClone(staffEmp, clones);
                }
                clonedStaffList[i] = (Employee) clones.get(staffEmp);
            }
            clonedEmployee.setStaff(clonedStaffList);
        }

        return clonedEmployee;
    }
}
