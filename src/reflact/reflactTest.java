package reflact;

public class reflactTest {
	
	private String name;
	private Integer age;
	
	private String email;
	private String phone;
	
	
	
	
	public reflactTest() {
		super();
	}
	public reflactTest(String name, Integer age, String email, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
	}
	public String getInfo() {
		String retu = "";
		retu = name+"*"+age+"*"+email+"*"+phone;
		return "this is publci info :"+retu;
	}
	
	private String readInfo() {
		String retu = "";
		retu = name+"*"+age+"*"+email+"*"+phone;
		return "this is private info :"+retu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
