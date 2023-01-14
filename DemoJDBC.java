package com.test2;

/*
 * 1.import--->java.sql

 *2. load and register the driver-->com.mysql.jdbc.Driver
 * 3.create a connection-->Connection
 * 4.Create a statement--->Statement
 * 5.execute the query-->
 * 6.process theb result
 * 7.Close
 * 
 * 
 */

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class DemoJDBC {

	public static void main(String[] args) throws Exception {
		try{
			//register driver class
			Class.forName("com.mysql.jdbc.Driver");
			//establish connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tree2","root","Shahjad@7");
			//execute queries
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from fruit1");
			while(rs.next()){
			System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			//close connection
			con.close();
			}
			catch(Exception e){
			e.printStackTrace();
			}
			}
			}	
		
		
	
		/*String url="jdbc:mysql//localhost:3306//tree";
		String uname="root";
        String pass="Shahjad@7";
        String query="select * from abc";
		Class.forName("com.mysql.jdbc.Driver");//
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("username");
		System.out.println(name);
		st.close();
		con.close();
		*/
		// TODO Auto-generated method stub
        /*String url="jdbc:mysql://localhost:3306//tree2";
		String uname="root";
        String pass="Shahjad@7";
        String query="select * from fruit1";
		Class.forName("com.mysql.jdbc.Driver");//
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("username");
		System.out.println(name);
		st.close();
		con.close();
}

}*/
	/*	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tree2","root","Shahjad@7");
			Statement st=con.createStatement();
			System.out.println("Inserting records");
			String query="select * from fruit1";
			ResultSet rs=st.executeQuery(query);
			String name=rs.getString("");
			System.out.println(name);
			rs.next();
			st.executeUpdate(query);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
}
*/
