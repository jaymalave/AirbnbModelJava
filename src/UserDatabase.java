import java.util.Vector;

public class UserDatabase {
	
	 Vector<User> users = new Vector<User>();

	 public void addUser(User user){
		 users.add(user);
	 }
	 
	 public User getUser(int index){
	    User user = users.get(index);
		return user;
	    
	 }
}
