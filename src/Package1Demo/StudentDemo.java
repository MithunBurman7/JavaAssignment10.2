package Package1Demo;

//created a class named student.

public class StudentDemo {
	/**
	* taking variable integer, so that we store integer
	* data type like roll number.
	*/
	
	        private int rollNo;
	        /*
	        *taking variable String, so that we store String type like name.
	        *
	        **/
	        private String name;
	        /*
	        * creating a function setRollno which will
	        * receive integer type of roll number
	        */
	        public void setRollno(int r) {
	        	// here assign in rollNo
	        	rollNo = r;
	        	}
	        	/*
	        	* creating a function setName which will
	        	* receive string type of name
	        	*/
	        	public void setName(String n) {
	        	// and also here we'll assign in name
	        	name = n;
	        	}
	        	/*
	        	* creating a function getRollno, which is integer
	        	* return type and it will return rollno
	        	*/
	        	public int getRollno() {
	        	return (rollNo);
	        	}
	        	/*
	        	* same as i've creating a another function
	        	* getName, which is String return type and it
	        	* will return name
	        	*/
	        	public String getName() {
	        	return (name);
	        	}       

}
