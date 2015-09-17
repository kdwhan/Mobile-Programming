package ThirdWeek;

public class Pet extends Animal{
	private String name;
	private int age;
	private double weight;
	
	public String toString() {
		return ("Name: " + name + " Age: " + age + " years"
						+ "\nWeight: " + weight + " pounds");
	}
	
	public Pet(String initialName, int initialAge, double initialWeight) {
		if(initialAge < 0 && initialAge < 0) System.exit(0);
		name = initialName; age = initialAge; weight = initialWeight;
	}
	
	//오버로딩
	public Pet(String initialName) {
		name = initialName;
		age = 0;
		weight = 0;
	}
	
	public Pet(int initialAge) {
		name = "no name yet";
		weight =0;
		if(initialAge <0) {
			System.out.println("Error: Negative age.");
			System.exit(0);
		}else {
			age = initialAge;
		}
	}
	
	public Pet() {
		name = " NO name Yet";
		age =0;
		weight =0;
	}
	public void set(String newName, int newAge, double newWeight) {
		 // 구현 하시오.
		this.name = newName;
		this.age = newAge;
		this.weight = newWeight;
	}
	
	public void setAge( int newAge) {
              // 구현하시오.
		this.age = newAge;
	}
	
	public void setWeight( double newWeight) {
	      // 구현하시오.
		this.weight = newWeight;
      }
	
	public String getName() {
		// 구현하시오.
		return this.name;
	}
	
	public int getAge() {
		// 구현하시오.
		return this.age;
	}
	
	public double getWeight() {
		// 구현하시오.
		return this.weight;
	}
	
	public Pet(String initialName, int initialAge, double initialWeight, String iniGender) {
		super(iniGender);
		name = initialName;
		if((initialAge < 0) || (initialWeight < 0)) {
			System.out.println("Error: Negative age or weight.");
			System.exit(0);
		}else {
			age = initialAge;
			weight = initialWeight;
		}
	}
	
}
