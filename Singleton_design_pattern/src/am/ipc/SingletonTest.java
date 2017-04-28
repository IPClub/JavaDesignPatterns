package am.ipc;

public class SingletonTest {

	public static void main(String[] args) {
		User user1 = User.getInstance();
		user1.setUsername("us1");
		user1.setEmail("user1@gmail.com");
		user1.setAge(23);
		user1.setPassword("pass1");
		
		
		User user2 = User.getInstance();
		user2.setUsername("us2");
		user2.setEmail("user2@gmail.com");
		user2.setAge(24);
		user2.setPassword("pass2");
		
		user1.printInfo();
		user2.printInfo();
	}

}
