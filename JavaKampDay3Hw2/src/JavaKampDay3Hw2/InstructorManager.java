package JavaKampDay3Hw2;

public class InstructorManager extends UserManager{
	@Override 
	public void add(User user) {
		System.out.println("Instructor : "+ user.getFirstName()+ " " + user.getLastName() 
		+ " system added" );
	}
	
}