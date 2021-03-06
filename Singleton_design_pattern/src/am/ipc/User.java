package am.ipc;

public class User {
	
	private String username;
	private String password;
	private String email;
	private int age;
	private static User user;
	
	private User(){
		
	}
	
	public synchronized static User getInstance(){
		if(user == null){
			user  = new User();
		}
		return user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public void printInfo(){
		System.out.println("username = " + username);
		System.out.println("password = "+ password);
		System.out.println("email = " + email);
		System.out.println("age = " + age);
	}
}
