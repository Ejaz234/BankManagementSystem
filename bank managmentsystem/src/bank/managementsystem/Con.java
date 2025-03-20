package bank.managementsystem;

import java.sql.*;

public class Con {

    Connection connection;

    public Statement statement;
    public Con(){
        try {
               connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","password");
               statement = connection.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

