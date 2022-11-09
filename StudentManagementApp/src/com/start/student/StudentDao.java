package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

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

	public static boolean deleteStudent(int studentId) {
		boolean status=false;
		try {
			Connection con= ConnectionProvider.createC();
			String query="delete from students where sid=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, studentId);
			pstmt.executeUpdate();
			status=true;
			
		}catch(Exception e) {
			
		}
		return status;
	}

	public static void displayStudents() {
		try {
			Connection con= ConnectionProvider.createC();
			String query="select * from students";
			Statement pstmt=con.createStatement();
//			pstmt.setInt(1, studentId);
//			pstmt.executeUpdate();
			ResultSet rs=pstmt.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+ rs.getString(4));

//				System.out.println(rs.getInt(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+ rs.getString("sCity"));
			}
		}catch(Exception e) {
			
		}		
	}

	}
