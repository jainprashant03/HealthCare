/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBMS;
import java.sql.*;
/**
 *
 * @author Prashant
 */
public class DoctorData {
    public static void viewDrData(String docID){
        try {
            // Loading the driver. This creates an instance of the driver
            // and calls the registerDriver method to make Oracle Thin
            // driver, at ora.csc.ncsu.edu, available to clients.

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            
            try {
            // Get a connection instance from the first driver in the 
            // DriverManager list that recognizes the URL jdbcURL
            connection = DriverManager.getConnection(GVariable.jdbcURL, GVariable.user, GVariable.password);
            
            // Create a statement instance that will be sending
            // your SQL statements to the DBMS
            statement = connection.createStatement();
            
            // Get records from the Vaccination table
            result = statement.executeQuery("SELECT * FROM DOCTOR WHERE DOCTORID='"+docID+"'");
        
            // Now result contains the rows of cat names and weights from
            // the CATS table. To access the data, use the method
            // NEXT to access all rows in result, one row at a time
            while (result.next()) {
                String doctorID = result.getString("DOCTORID");
                String name = result.getString("NAME");
                String speciality = result.getString("SPECIALIZATION");
                String phoneNum = result.getString("CONTACTNUM");
                String fee = result.getString("FEELIST");
                
                System.out.println(" DoctorID: " + doctorID + " Name: "+ name +
                        " Specialization: " + speciality + " Contact Num: " + phoneNum+ " Fee List: " + fee);
            }
            } catch(Throwable e) {
                connection.rollback();
                e.printStackTrace();
            }finally {
                close(result);
                close(statement);
                close(connection);
            }
            } catch(Throwable oops) {
                oops.printStackTrace();
            }
}
    
    public static void viewDrData(){
        try {
            // Loading the driver. This creates an instance of the driver
            // and calls the registerDriver method to make Oracle Thin
            // driver, at ora.csc.ncsu.edu, available to clients.

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            
            try {
            // Get a connection instance from the first driver in the 
            // DriverManager list that recognizes the URL jdbcURL
            connection = DriverManager.getConnection(GVariable.jdbcURL, GVariable.user, GVariable.password);
            
            // Create a statement instance that will be sending
            // your SQL statements to the DBMS
            statement = connection.createStatement();
            
            // Get records from the Vaccination table
            result = statement.executeQuery("SELECT * FROM DOCTOR");
        
            // Now result contains the rows of cat names and weights from
            // the CATS table. To access the data, use the method
            // NEXT to access all rows in result, one row at a time
            while (result.next()) {
                String doctorID = result.getString("DOCTORID");
                String name = result.getString("NAME");
                String speciality = result.getString("SPECIALIZATION");
                String phoneNum = result.getString("CONTACTNUM");
                String fee = result.getString("FEELIST");
                
                System.out.println(" DoctorID: " + doctorID + " Name: "+ name +
                        " Specialization: " + speciality + " Contact Num: " + phoneNum+ " Fee List: " + fee);
            }
            } catch(Throwable e) {
                connection.rollback();
                e.printStackTrace();
            }finally {
                close(result);
                close(statement);
                close(connection);
            }
            } catch(Throwable oops) {
                oops.printStackTrace();
            }
}

    
    public static void insertDrData(String name, String speciality, String contactnum, String feelist){
        try {
            // Loading the driver. This creates an instance of the driver
            // and calls the registerDriver method to make Oracle Thin
            // driver, at ora.csc.ncsu.edu, available to clients.

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            
            try {
            // Get a connection instance from the first driver in the 
            // DriverManager list that recognizes the URL jdbcURL
            connection = DriverManager.getConnection(GVariable.jdbcURL, GVariable.user, GVariable.password);
            
            // Create a statement instance that will be sending
            // your SQL statements to the DBMS
            statement = connection.createStatement();
                        
            // Populate the CATS table
            statement.executeUpdate("INSERT INTO DOCTOR VALUES(DOCTOR_SEQ.NEXTVAL,'"+name+"','"+speciality
                    +"','"+contactnum+"','"+feelist+"')");
            connection.commit();
           
            } catch(Throwable e) {
                connection.rollback();
                e.printStackTrace();
            }finally {
                close(result);
                close(statement);
                close(connection);
            }
} catch(Throwable oops) {
            oops.printStackTrace();
        }
    }
    
    public static void deleteDrData(String docID){
        try {
            // Loading the driver. This creates an instance of the driver
            // and calls the registerDriver method to make Oracle Thin
            // driver, at ora.csc.ncsu.edu, available to clients.

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            
            try {
            // Get a connection instance from the first driver in the 
            // DriverManager list that recognizes the URL jdbcURL
            connection = DriverManager.getConnection(GVariable.jdbcURL, GVariable.user, GVariable.password);
            
            // Create a statement instance that will be sending
            // your SQL statements to the DBMS
            statement = connection.createStatement();
                        
            // Populate the CATS table
            statement.executeUpdate("DELETE FROM DOCTOR WHERE DOCTORID='"+docID+"';");
            connection.commit();
           
            } catch(Throwable e) {
                connection.rollback();
                e.printStackTrace();
            }finally {
                close(result);
                close(statement);
                close(connection);
            }
} catch(Throwable oops) {
            oops.printStackTrace();
        }
    }
    
    public static void editSpeciality(String docID, String speciality){
        try {
            // Loading the driver. This creates an instance of the driver
            // and calls the registerDriver method to make Oracle Thin
            // driver, at ora.csc.ncsu.edu, available to clients.

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            
            try {
            // Get a connection instance from the first driver in the 
            // DriverManager list that recognizes the URL jdbcURL
            connection = DriverManager.getConnection(GVariable.jdbcURL, GVariable.user, GVariable.password);
            
            // Create a statement instance that will be sending
            // your SQL statements to the DBMS
            statement = connection.createStatement();
                        
            // Populate the CATS table
            statement.executeUpdate("UPDATE DOCTOR SET SPECIALIZATION='"+speciality+"' WHERE DOCTORID='"+docID+"';");
            connection.commit();
           
            } catch(Throwable e) {
                connection.rollback();
                e.printStackTrace();
            }finally {
                close(result);
                close(statement);
                close(connection);
            }
} catch(Throwable oops) {
            oops.printStackTrace();
        }
    }
    public static void editContactNum(String docID, String phoneNum){
        try {
            // Loading the driver. This creates an instance of the driver
            // and calls the registerDriver method to make Oracle Thin
            // driver, at ora.csc.ncsu.edu, available to clients.

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            
            try {
            // Get a connection instance from the first driver in the 
            // DriverManager list that recognizes the URL jdbcURL
            connection = DriverManager.getConnection(GVariable.jdbcURL, GVariable.user, GVariable.password);
            
            // Create a statement instance that will be sending
            // your SQL statements to the DBMS
            statement = connection.createStatement();
                        
            // Populate the CATS table
            statement.executeUpdate("UPDATE DOCTOR SET CONTACTNUM='"+phoneNum+"' WHERE DOCTORID='"+docID+"';");
            connection.commit();
           
            } catch(Throwable e) {
                connection.rollback();
                e.printStackTrace();
            }finally {
                close(result);
                close(statement);
                close(connection);
            }
} catch(Throwable oops) {
            oops.printStackTrace();
        }
    }
    public static void editFeeList(String docID, String feeList){
        try {
            // Loading the driver. This creates an instance of the driver
            // and calls the registerDriver method to make Oracle Thin
            // driver, at ora.csc.ncsu.edu, available to clients.

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection connection = null;
            Statement statement = null;
            ResultSet result = null;
            
            try {
            // Get a connection instance from the first driver in the 
            // DriverManager list that recognizes the URL jdbcURL
            connection = DriverManager.getConnection(GVariable.jdbcURL, GVariable.user, GVariable.password);
            
            // Create a statement instance that will be sending
            // your SQL statements to the DBMS
            statement = connection.createStatement();
                        
            // Populate the CATS table
            statement.executeUpdate("UPDATE DOCTOR SET FEELIST='"+feeList+"' WHERE DOCTORID='"+docID+"';");
            connection.commit();
           
            } catch(Throwable e) {
                connection.rollback();
                e.printStackTrace();
            }finally {
                close(result);
                close(statement);
                close(connection);
            }
} catch(Throwable oops) {
            oops.printStackTrace();
        }
    }
    static void close(Connection connection) {
        if(connection != null) {
            try { 
            connection.close(); 
            } catch(Throwable whatever) {}
        }
    }
    static void close(Statement statement) {
        if(statement != null) {
            try { 
            statement.close(); 
            } catch(Throwable whatever) {}
        }
    }
    static void close(ResultSet result) {
        if(result != null) {
            try { 
            result.close(); 
            } catch(Throwable whatever) {}
        }
    }
}