package JavaKampDay3Hw2;

public class Instructor extends User{
		private String branch;


		 public Instructor() {
			 
		 }
		public Instructor(int id, String firstName, String lastName, String email, String phoneNumber, String branch) {
			super(id, firstName, lastName, email, phoneNumber);
			this.branch = branch;
		}

		public String getBranch() {
			return branch;
		}

		public void setBranch(String branch) {
			this.branch = branch;
		} 
		
		
}
