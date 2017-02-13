package com.tongxuweixin.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MainTest {


    public static void main(String[] args) throws Exception {
        System.out.print(1);
        Connection conn = DriverManager.getConnection("jdbc:ucanaccess:///Users/higgs/Documents/mdb/111.mdb");
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery("SELECT * FROM 法人单位");
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
    }
}
