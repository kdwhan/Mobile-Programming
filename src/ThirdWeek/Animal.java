package ThirdWeek;

public class Animal {
	
	String gender;
	
	public String toString() {
		return("Gender :"+ gender);
	}
	
	public Animal() {
		gender = "Not init gender";
	}
	
	public Animal(String iniGender) {
		gender = iniGender;
	}
	
	public void setGender(String iniGender) {
		gender = iniGender;
	}
	
	public String getGender() {
		return gender;
	}

}
