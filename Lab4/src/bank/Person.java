package bank;

class Person {
	private String name;
	private float age;
	Person(String name,float age){
		this.name=name;
		this.age=age;
	}
	
	public void setPersonName(String name) {
		this.name=name;
	}
	public void setPersonAge(float age) {
		this.age=age;
	}
	
	public String getPersonName() {
		return this.name;
	}
	public float getPersonAge() {
		return this.age;
	}
}
