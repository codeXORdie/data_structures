package queue;

import java.util.Queue;

class Student implements Comparable<Student>{
	private String name;
	private String grade;
	
	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student{name: " + name + "; grade: " + grade + "}\n";
	}

	@Override
	public int compareTo(Student s) {
		return grade.compareTo(s.grade);
	}
}

public class PriorityQueue {
	public static void main(String[] args) {
		
		Queue<Student> qs = new java.util.PriorityQueue<>();
		qs.add(new Student("Jim", "E"));
		qs.add(new Student("Tony", "E"));
		qs.add(new Student("Alice", "B"));
		qs.add(new Student("victor", "A"));
		qs.add(new Student("Fred", "D"));
		qs.add(new Student("Jo", "C"));
		
		System.out.println(qs);

	}

}
