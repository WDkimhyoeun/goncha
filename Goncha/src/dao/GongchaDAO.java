package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dto.EventDTO;

public class GongchaDAO {
	PreparedStatement pstmt;
	ResultSet rs;
	Connection conn;
	
	public GongchaDAO() {
		String url = "jdbc:sqlserver://lyra9409.database.windows.net:1433;database=lyra;user=lyra9409@lyra9409;password=distributed494316runSQL494316;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
	
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		try {
			conn = DriverManager.getConnection(url);
			
			System.out.println("디비 접속 완료!!!");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	
	public List<EventDTO> getEventList(){
		
		String query = "select e.title,\r\n" + 
				"	   e.event_time,\r\n" + 
				"	   i.imageName from gongcha_event e left join gongcha_event_img i on e.id = i.id order by e.id desc ";
		
		List<EventDTO> list = new ArrayList<EventDTO>();
		
		try {
			
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EventDTO eventDTO = new  EventDTO();
				eventDTO.setTitle(rs.getString(1));
				eventDTO.setEvent_time(rs.getString(2));
				eventDTO.setImageName(rs.getString(3));
				
				list.add(eventDTO);
			}
			
			return list;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return list;
	}

}
