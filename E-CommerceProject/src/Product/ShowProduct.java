package Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import databasesprogram.DBConnection;

public class ShowProduct {


	public static void productDisplay() {
		Connection con=DBConnection.getConneection();
		PreparedStatement ps = null;
			
		String query="select * from product Order by p_id";
		try {
			ps=con.prepareStatement(query);
		
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
