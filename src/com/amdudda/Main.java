package com.amdudda;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Check for JDBC driver - nothing will work without it.
        Database.checkJdbcDriver();

        // this creates the schema 'Beekeeper', sets up the tables, and adds some test data to the database.
        // Database.createDatabase();

        // display the main GUI form
        HarvestManager hm = new HarvestManager();


    }


}
