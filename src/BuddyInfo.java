
public class BuddyInfo {
	private int age;
	private String name;
	
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo();
		buddy.setAge(100);
		buddy.setName("Homer");
		System.out.println("Hello, "+buddy.getName());
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}