import java.util.*;


public class Utils {
	 Scanner sc = new Scanner(System.in);
	 
     public void registerUser(){
    	  System.out.println("Enter user_id");
    	  int user_id = sc.nextInt();
    	  System.out.println("name");
    	  String name = sc.next();
    	  System.out.println("registration date");
    	  String created_at = sc.next();
    	  User user = new User(user_id, name, created_at);
    	  UserDatabase userDb = new UserDatabase();
    	  userDb.addUser(user);
    	  System.out.println("User added successfully");
     }
}
