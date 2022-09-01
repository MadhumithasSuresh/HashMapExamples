package hashmap;

public class AadharCard {
	private long aadharNo;
	private String name;
	private int age;
	private boolean isMale;
	private String address;
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
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
	public boolean getIsMale() {
		return isMale;
	}
	public void setIsMale(boolean isMale) {
		this.isMale = isMale;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public AadharCard(long aadharNo,String name,int age,boolean isMale,String address)
	{
		this.aadharNo = aadharNo;
		this.name = name;
		this.age = age;
		this.isMale = isMale;
		this.address = address;
	}
	public String toString() {
		return"AadharNo = "+aadharNo+", Name = "+name+", Age = "+age+", Is Male = "+isMale+", Address = "+address;
	}

}
