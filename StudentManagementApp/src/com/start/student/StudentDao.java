package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
	
	public static boolean addStudentToDB(Student st) {
		boolean status =false;
		try {
			Connection con= ConnectionProvider.createC();
			String query="insert into students(sname,phone,scity) values (?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());
			
			pstmt.executeUpdate();
			status=true;
		}catch(Exception e) {
			
		}
		return status;
	}
}
