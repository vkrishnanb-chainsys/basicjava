package edu.lessons.day96.jdbc.mysql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.ResultSetMetaData;

public class MetaDataDemo
{
	public static void main(String args[])
	{
	    Connection con =null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		ResultSetMetaData meta=null;
		try
		{
			con=ConnectionFactory.getMYSQLConnection();
			ps  = con.prepareStatement("select * from emp");
		    rs=ps.executeQuery();
		    meta=rs.getMetaData();
		 	for(int i=1;i<=meta.getColumnCount();i++)
			{
			  System.out.print("column name: " + meta.getColumnName(i));
			  System.out.println( "\tData type: "+ meta.getColumnTypeName(i));
   		    }
		 }catch (SQLException sqe)
		 {
			System.out.println("SQLException:  " + sqe.getMessage());
		 }
		 catch (Exception e2)
		 {
			System.out.println("Exception:  " + e2.getMessage());
		 }
		finally
		{
			try
			{
			 if (con != null)
			  {
				  if(!con.isClosed()) con.close();
			  }
			 if (ps != null)    ps.close();
			}
			catch (Exception e)
			{
			  System.out.println("Error in closing Connection: " + e);
		    }
		 }//end of finally
/*		 finally
		{
			ConnectionFactory.cleanup(con, ps);
		 }*/
	}
}