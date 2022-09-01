package hashmap;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	private String degree;
	private boolean isMale;
	
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public Student(int rollNo, String name, int age, String degree, boolean isMale) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.degree = degree;
		this.isMale = isMale;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", degree=" + degree + ", isMale="
				+ isMale + "]";
	}
	
	

}
