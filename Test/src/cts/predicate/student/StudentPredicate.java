package cts.predicate.student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class StudentPredicate {



	

		public static Predicate<Student> isMarksAboveEqual80() {
			return student -> student.getMarks() >= 80;
		}
		
		public static Predicate<Student> isMarksFirstClass() {
			
			return student -> student.getMarks() >= 60 && student.getMarks() <=79;
		}
public static Predicate<Student> isMarksFail() {
			
			return student -> student.getMarks() < 50;
		
}
public static List<Student> filterStudent(List<Student> students, Predicate<Student> predicate) {
	return students.stream().filter(predicate).collect(Collectors.toList());
}
public static void main(String[] args) {
	List<Student> students = Arrays.asList( new Student("Pallavi", 80), new Student("Nikhil", 50),
			 new Student("Abhinav", 90), new Student("Satyam", 60),  new Student("Mrinal", 30),new Student("Preksha", 40));
	System.out.println("Distinction : ");
	StudentPredicate.filterStudent(students, StudentPredicate.isMarksAboveEqual80()).forEach(System.out::println);
	System.out.println("First Class: ");
	StudentPredicate.filterStudent(students, StudentPredicate.isMarksFirstClass()).forEach(System.out::println);
	System.out.println("Fail: ");
	StudentPredicate.filterStudent(students, StudentPredicate.isMarksFail()).forEach(System.out::println);



}

}
