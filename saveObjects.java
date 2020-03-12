package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

class Bird
{
	private String birdName;
	private String birdColor;
	
	public String getBirdName() {
		return birdName;
	}
	public void setBirdName(String birdName) {
		this.birdName = birdName;
	}
	public String getBirdColor() {
		return birdColor;
	}
	public void setBirdColor(String birdColor) {
		this.birdColor = birdColor;
	}
	public void fly(){}
	public void walk(){}
	class Student implements Serializable//this class objects only have to store so we are giving here
	{
		private int studentId;
		private String studentName;
		public int getStudentId() {
			return studentId;
		}
		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}
		public String getStudentName() {
			return studentName;
		}
		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}
	}
}
public class saveObjects {

	public static void main(String[] args) throws IOException {
		// create Student Object
		Student s1= new Student();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter student id:");
		//accept the data from keyboard to set value to the student id
		System.out.println("Enter Student name");
		s1.setStudentName(br.readLine());
		//serialize s1
		saveStudent(s1);
		
	}
public static void saveStudent(Student s)
{
	
}
}
