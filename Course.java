package set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class CourseComparator implements Comparator<Course>{
	
	@Override
	public int compare(Course c1, Course c2) {
		//ignore null fields possibilities
		return c1.getName().compareTo(c2.getName());
	}
}

public class Course {
	
	String name;
	int duration;
	
	public Course(String name, int duration) {
		this.name = name;
		this.duration = duration;
	}
	
	public String getName() {
		return name;
	}
	
	public int getDuration() {
		return duration;
	}
	
	@Override
	public String toString() {
		return "Course name " + name + ", duration " + duration + "\n";
	}
	
	public static void main(String[] args) {
		Set<Course> courses = new TreeSet<>(new CourseComparator());
		courses.add(new Course("Math", 16));
		courses.add(new Course("Phisics", 18));
		courses.add(new Course("Chemistry", 14));
		courses.add(new Course("Java Programming", 16));
		System.out.println(courses);
	}

}
