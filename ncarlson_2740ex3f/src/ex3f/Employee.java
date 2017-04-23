package ex3f;

public class Employee {
	private String name;
	private int idNum;
	private String department;
	private String position;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public int getIdNum() {
		return this.idNum;
	}	
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}	
	public String getDepartment() {
		return this.department;
	}	
	public void setDepartment(String department) {
		this.department = department;
	}	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Emp ID-" + idNum + ", Emp Name-"+ name + ", Department-" + department + ", Position-" + position;
	}
	
	//no arg constructor
	public Employee(){
		idNum = 0;
		name = "";
		department = "";
		position = "";
	}
	//2 arg constructor
	public Employee(int idNum, String name ){
		this.idNum = idNum;
		this.name = name;
		department = "";
		position = "";
	}
	// 4 arg constructor
	public Employee(int idNum, String name, String department, String position){
		this.idNum = idNum;
		this.name = name;
		this.department = department;
		this.position = position;
	}
}







