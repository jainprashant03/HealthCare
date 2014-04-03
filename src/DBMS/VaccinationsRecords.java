/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DBMS;
import java.sql.*;

public class VaccinationsRecords {
        
    public static void viewVaccRecord(String recID){
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
            result = statement.executeQuery("SELECT * FROM VACCINATIONS WHERE RECORDID='"+recID+"'");
        
            // Now result contains the rows of cat names and weights from
            // the CATS table. To access the data, use the method
            // NEXT to access all rows in result, one row at a time
            while (result.next()) {
                String date = result.getString("VACCDATE");
                String time = result.getString("VACCTIME");
                String type = result.getString("VACCTYPE");
                String recordId = result.getString("RECORDID");
                String doctorId = result.getString("DOCTORID");
                
                System.out.println("RecordID: " + recordId + " DoctorID: " + doctorId + " Date: "+ date +
                        " Time: " + time + " Vaccination Type: " + type);
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
    
    public static void viewVaccRecord(){
        try{
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
            result = statement.executeQuery("SELECT * FROM VACCINATIONS");
        
            // Now result contains the rows of cat names and weights from
            // the CATS table. To access the data, use the method
            // NEXT to access all rows in result, one row at a time
            while (result.next()) {
                String date = result.getString("VACCDATE");
                String time = result.getString("VACCTIME");
                String type = result.getString("VACCTYPE");
                String recordId = result.getString("RECORDID");
                String doctorId = result.getString("DOCTORID");
                
                System.out.println("RecordID: " + recordId + " DoctorID: " + doctorId + " Date: "+ date +
                        " Time: " + time + " Vaccination Type: " + type);
            }
            }catch(Throwable e) {
                connection.rollback();
                e.printStackTrace();
            }
            finally {
                close(result);
                close(statement);
                close(connection);
            }
            } catch(Throwable oops) {
                oops.printStackTrace();
            }
            
    }

    
    public static void insertVaccRecord(String recID, String docID, String type, String date, String time){
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
            statement.executeUpdate("INSERT INTO VACCINATION VALUES(TO_DATE('"+date+"','MM-DD-YYYY'),TO_DATE('"
                    +time+"','HH24:MI:SS'),'"+type+"','"+recID+"','"+docID+"')");
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
    
    public static void deleteVaccRecord(String recID, String docID, String date, String time){
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
            statement.executeUpdate("DELETE FROM VACCINATION WHERE VACCDATE=TO_DATE('"+date+"','MM-DD-YYYY')" +
                    "AND VACCTIME=TO_DATE('"+time+"','HH24:MI:SS') AND RECORDID='"+recID+"' AND DOCTORID='"+docID+"';");
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
    
    public static void updateVaccRecord(String recID, String docID, String date, String time, String type){
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
            statement.executeUpdate("UPDATE VACCINATION SET VACCTYPE='"+type+"' WHERE VACCDATE=TO_DATE('"+date+"','MM-DD-YYYY')" +
                    "AND VACCTIME=TO_DATE('"+time+"','HH24:MI:SS') AND RECORDID='"+recID+"' AND DOCTORID='"+docID+"';");
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



 