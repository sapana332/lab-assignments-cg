package bankaccount.serviceImpl;




	public class Person
	{
	String name;
	float age;
	public String getName()
	{
	return name;		
	}
	void setName1(String name)
	{
			this.name=name;
	}
	float getAge()
	{
			return age;
	}
	void setAge(float age)
	{
	if(age<=0)
	{
	System.out.println("Enter valid age");
	}
	this.age=age;
	}
	

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}

}
