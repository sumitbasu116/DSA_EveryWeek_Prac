package co.sumit.design.pattern;

public class Student {
	//mandatory fields
	private final long id;
	private final String name;
	//optional fields
	private final String address;
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public Student(Builder builder) {
		this.id=builder.id;
		this.name=builder.name;
		this.address=builder.address;
	}
	
	private static class Builder{
		private long id;
		private String name;
		
		private String address;
		
		public Builder(long id,String name) {
			this.id=id;
			this.name=name;
		}
		
		public Builder address(String address) {
			this.address=address;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}
	
	public static void main(String[] args) {
		
		Student MBAStudent1 = new Student.Builder(101, "Sumit").build(); 
		Student MBAStudent2 =new Student.Builder(101, "Sumit").address("123 Street").build();
	}
}
