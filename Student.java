import java.util.List;

class Student {
	String index;
	String firstName;
	String lastName;
	//added list
	List<Integer> grades;
	//TODO constructor
	
	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}
	//TODO seters & getters
	public void setIndex(String index) {
		this.index = index;
	}
	public String getIndex() {
		return index;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public List<Integer> getGrades() {
		return grades;
	}
	
	public double getAverage() {
		
		
		//TODO
		for (Integer grade : grades) {
			sum += grade
		}
		
		return (double)sum/grades.size();
		
	}

	public int ECTSCredits() {
		//TODO
		int krediti = 0;
		for (Integer grade : grades) {
			if(grade >= 6)
				krediti += 6
		}
		return krediti;
	}
}
