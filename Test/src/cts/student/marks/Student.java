package cts.student.marks;

public class Student {


		int rollno;

	    String name;

	    int english;

	    int science;

	    int maths;

	    


		public Student(int rollno, String name, int english, int science, int maths) {
			super();
			this.rollno = rollno;
			this.name = name;
			this.english = english;
			this.science = science;
			this.maths = maths;
		}

		public int getRollno() {

			return rollno;

		}

		public void setRollno(int rollno) {

			this.rollno = rollno;

		}

		public String getName() {

			return name;

		}

		public void setName(String name) {

			this.name = name;

		}

		public int getEnglish() {

			return english;

		}

		public void setEnglish(int english) {

			this.english = english;

		}

		public int getScience() {

			return science;

		}

		public void setScience(int science) {

			this.science = science;

		}

		public int getMaths() {

			return maths;

		}

		public void setMaths(int maths) {

			this.maths = maths;

		}

	    

		public String toString()

		{

			return rollno + " : " + name + " : " +" : "+english+" : "+ science +" : "+maths+" ; "

			;

		}

	

}
