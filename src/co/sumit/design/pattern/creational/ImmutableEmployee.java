package co.sumit.design.pattern.creational;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableEmployee {

	private final long empId;
	private final String name;
	
	private final int age;
	
	private final List<String> hobbies;
	
	public ImmutableEmployee(long id,String name,int age,List<String> hobbies) {
		this.empId=id;
		this.name=name;
		this.age=age;
		this.hobbies = new ArrayList<>();
		for(String hobby:hobbies) {
			this.hobbies.add(hobby);
		}
	}
	public long getId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public List<String> getHobbies(){
		List<String> temp = new ArrayList<>();
		if(this.hobbies!=null && !this.hobbies.isEmpty()) {
			for(String hobby:this.hobbies) {
				temp.add(hobby);
			}
		}
		return temp;
	}
}
