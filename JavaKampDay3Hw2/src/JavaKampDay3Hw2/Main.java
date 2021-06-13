package JavaKampDay3Hw2;

public class Main {

	public static void main(String[] args) {
		User user  = new User(); 
		user.setId(1);
		user.setFirstName("Ahmet");
		user.setLastName("Demir");
		user.setEmail("demirahmet@fake.com");
		user.setPhoneNumber("65463513");
		
		Instructor instructor = new Instructor(); 
		instructor.setFirstName("Mehmet"); 
		instructor.setLastName("Kılıç");
		instructor.setEmail("kilicmehmet@fake.com");
		instructor.setPhoneNumber("56413651631");
		instructor.setBranch("Maths"); 
		
		Student student = new Student();
		student.setFirstName("süleyman");
		student.setLastName("ince");
		student.setEmail("incesulo@afake.com");
		student.setPhoneNumber("69879856");
		student.setTypeOfEducation("Learn Maths"); 
		
		UserManager userManager = new UserManager();
		userManager.add(user); 
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor); 
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
	}
		
		


	}


