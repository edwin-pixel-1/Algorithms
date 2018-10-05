package com.edwin.cobos.patterns.facade;

public class Client {

    public static void main(String[] args) {
        JDBCService jdbcService = new JDBCService();

        if (jdbcService.request() != 0) {
            System.out.println("Request Successful");
        } else {
            System.out.println("Request Error");
        }
    }

}
