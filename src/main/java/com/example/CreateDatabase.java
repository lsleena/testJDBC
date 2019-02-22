package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {

    //JDBC driver and Database URL

    static final String JDBC_DRIVER =  "com.mysql.jdbc.Driver";
    static  final String DB_URL = "jdbc:mysql://localhost/?autoReconnect=true&useSSL=false";

    // Database credintials
    static final String USERNAME = "root";
    static final String PASSWORD = "";

    public static void main(String[] args){

        Connection connection = null;
        Statement stmt = null;

        try{

            //open connection

            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            stmt = connection.createStatement();
            System.out.println("Creating Databases....");
            String sql = "CREATE DATABASE EMP";
            stmt.executeUpdate(sql);

            System.out.println("Database created successfully..");


        }catch (Exception e){

        }

    }
}
