package JavaKampDay3Hw2;

public class Student extends User{
	private String typeOfEducation;

	public Student() {
		
	}
	
	public Student(int id, String firstName, String lastName, String email, String phoneNumber, String typeOfEducation) {
		super(id, firstName, lastName, email, email);
		this.typeOfEducation = typeOfEducation;
	}

	public String getTypeOfEducation() {
		return typeOfEducation;
	}

	public void setTypeOfEducation(String typeOfEducation) {
		this.typeOfEducation = typeOfEducation;
	} 
	
	
}
