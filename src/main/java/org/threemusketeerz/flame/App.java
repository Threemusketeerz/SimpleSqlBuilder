package org.threemusketeerz.flame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import org.threemusketeerz.flame.sqlbuilder.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=webshop;password=123456Sql;user=sa";
    	Query query = new QueryBuilder()
    			.selectAll()
    			.from("product")
    			.where("product.id=1")
    			.end();
    	
    	try
    	{
    		Connection connection = DriverManager.getConnection(connectionUrl);
    		Statement statement = connection.createStatement();
    		ResultSet result = statement.executeQuery(query.toString());
    		ResultSetMetaData metaData = result.getMetaData();
    		
    		System.out.println("Column count: " + metaData.getColumnCount());
    		
    		while (result.next())
    		{
    			for (int i = 1; i < metaData.getColumnCount(); ++i)
    			{
    				System.out.println(metaData.getColumnLabel(i)+ ": " + result.getString(i));
    			}
    		}

    		connection.close();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	

    	System.out.println("Printing query: ");
    	System.out.println(query);
    }
}
