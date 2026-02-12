package com.work.jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {
    private static final Properties props=new Properties();

    //static block runs once when the class is loaded into memory

    static {
        try(InputStream in = ClassLoader.getSystemResourceAsStream("db.properties")){
            if(in == null) throw new RuntimeException("db.properties not found");
            props.load(in);
        }catch (Exception e){
            throw new RuntimeException("Failed to load Db config",e);
        }
    }

    public static Connection getConnection() throws SQLException{
//        try{
//            class.forName("com.mysql.cj.jdbc.Driver");
//        }catch(ClassNotFoundException e){
//            e.printStackTrace;
//        }
        return DriverManager.getConnection(
                props.getProperty("db.url"),
                props.getProperty("db.user"),
                props.getProperty("db.password")
        );
    }
}
