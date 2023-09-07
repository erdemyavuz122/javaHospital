package hospital;

public class Patient {
	int id;
	String name;
	String state;
	String lawyer;
	public Patient(int id, String name, String state, String lawyer) {
		this.id = id;
		this.name = name;
		this.state = state;
		this.lawyer = lawyer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLawyer() {
		return lawyer;
	}
	public void setLawyer(String lawyer) {
		this.lawyer = lawyer;
	}

	public void toStr() {
		System.out.println("name: "+ this.name+"lawyer: "+this.lawyer);
	}
	
	
	

}
