package com.pkg1;

import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
    	StudentDao studentDao = new StudentDao();
    	Student student = new Student(2,"Sarthak", "Kumar","sarthakkumar160627@gmail.com");
    	studentDao.saveStudent(student);
    	
    	List<Student> students = studentDao.getStudents();
    	students.forEach(s->System.out.println(s.getFirstName()+" "+s.getLastName()));
    }
}
