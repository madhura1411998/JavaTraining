package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.start.student.Student;
import com.start.student.StudentDao;

public class Start {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello world");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to add a student");
			System.out.println("press 2 to delete a student");
			System.out.println("press 3 to display a student");
			System.out.println("press 4 to update a student");
			System.out.println("press 5 to exit the app");
			int choice=Integer.parseInt(br.readLine());
			
			if(choice==1) {
				//add student
				System.out.println("Enter student's full name : ");
				String name=br.readLine();
				System.out.println("Enter student's phone number : ");
				String phone=br.readLine();
				System.out.println("Enter student's city : ");
				String city=br.readLine();
				Student st=new Student(name,phone,city);
				System.out.println(st);
				boolean answer=StudentDao.addStudentToDB(st);
				if(answer) {
					System.out.println("Student added successfully");
				}
				else {
					System.out.println("There is some problem please contact admin");
				}
			}else if(choice == 2) {
				//delete student
				System.out.println("Enter Student id to delete : ");
				int studentId=Integer.parseInt(br.readLine());
				boolean answer=StudentDao.deleteStudent(studentId);
				if(answer) {
					System.out.println("Student deleted succesfully");
				}
				else {
					System.out.println("There is some problem please contact admin");
				}
			}else if(choice == 3) {
				//display student
				System.out.println("Below are the students in SMS");
				StudentDao.displayStudents();
				
			}else if(choice == 4) {
				//update student
				System.out.println("Enter id of student to update : ");
				int studentId=Integer.parseInt(br.readLine());
				System.out.println("Enter name of student : ");
				Scanner sc=new Scanner(System.in);
				String name=sc.nextLine();
				boolean answer=StudentDao.updateStudent(name,studentId);
				if(answer) {
					System.out.println("Student updated succesfully");
				}
				else {
					System.out.println("There is some problem please contact admin");
				}
			}
			else if(choice == 5) {
				//exit menu
				System.exit(0);
			}else {

			}
			System.out.println("Thanks for using the student management system");
		}
	}
}
