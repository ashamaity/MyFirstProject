package javaprog;

public class useEncapsulation {
	
	private String name;
	private int age;
	private String address;
	
	useEncapsulation(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
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



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public void details()
	{
		System.out.print("name :"+name +" "+"age  :"+" "+"address :"+" ");
	}
	

	public static void main(String[] args) {
		
		useEncapsulation obj1=new useEncapsulation("Ashma",29,"Pune");
		obj1.details();
		obj1.address="Delhi";
		obj1.age=26;
		obj1.name="Piu";
		obj1.details();
		

	}

}
