package com.srikanth;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GetDocDetailsFromDb {
	String str;
	public GetDocDetailsFromDb(String str)
	{
		this.str = str;
		
		//System.out.println(str);
	}
	
	


	public ArrayList getDetails() throws Exception
	{
		Connection con = ConnectionManager.getConnection();
		String query = "SELECT *FROM docDetails WHERE dspc = ?;";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, str);
		//System.out.println("how are you");
		ResultSet rs = ps.executeQuery();
        rs.next();
        
		ArrayList ls = new ArrayList();
		
	    ls.add(rs.getString("id"));
	    ls.add(rs.getString("pname"));
	    ls.add(rs.getString("pAge"));
	    ls.add(rs.getString("pgen"));
	    ls.add(rs.getString("pmbno"));
	    ls.add(rs.getString("pmid"));
	    ls.add(rs.getString("username"));
	    ls.add(rs.getString("passkey"));
	  
	    for(int i=0;i<8;i++)
	    {
	    	System.out.println(ls.get(i));
	    }
	    
	    
	   
	    return ls;
		
	}

}
