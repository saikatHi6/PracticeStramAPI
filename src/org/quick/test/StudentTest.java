package org.quick.test;

import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}

    @Override
    public String toString(){
        return getFname();
    }

}

//Complete the code
public class StudentTest
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		List<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
        studentList.stream().sorted(Comparator.comparingDouble(Student::getCgpa).reversed()).
        sorted(Comparator.comparing(Student::getFname).reversed()).map(Student::getFname).forEach(System.out::println);
      	/*for(Student st: studentList){
			System.out.println(st.getFname());
		}*/
	}
}




