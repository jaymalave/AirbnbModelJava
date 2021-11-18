import java.util.*;


public class Utils {
	 Scanner sc = new Scanner(System.in);
	 
     public void registerUser(){
    	  System.out.println("Enter user_id");
    	  int user_id = sc.nextInt();
    	  System.out.println("Enter your name");
    	  String name = sc.next();
    	  System.out.println("registration date");
    	  String created_at = sc.next();
    	  User user = new User(user_id, name, created_at);
    	  UserDatabase userDb = new UserDatabase();
    	  userDb.addUser(user);
    	  System.out.println("User added successfully");
     }
    
     public void registerHost(){
    	 System.out.println("Enter host_id");
    	 int host_id = sc.nextInt();
    	 System.out.println("Enter your name");
   	     String full_name = sc.next();
   	     System.out.println("registration date");
   	     String created_at = sc.next();  
   	     System.out.println("Enter your email");
   	     String email = sc.next();
   	     Host host = new Host(host_id, full_name, created_at, false, email);
   	     HostDatabase hostDb = new HostDatabase();
   	     hostDb.addHost(host);
   	     System.out.println("Host added successfully");
     }
    
    public void registerHouse(){
	   	 System.out.println("Enter host_id");
	   	 int host_id = sc.nextInt();
		 System.out.println("Enter owner_id");
		 int owner_id = sc.nextInt();
		 System.out.println("Enter customer_id");
		 int customer_id = sc.nextInt();
		 System.out.println("Enter address");
		 String address = sc.next();
		 System.out.println("Enter occupied count");
		 int occup_count = sc.nextInt();
		 System.out.println("Enter city");
		 String city = sc.next();
		 House house = new House(host_id, owner_id, customer_id, address, false, occup_count, city);
		 HouseDatabase houseDb = new HouseDatabase();
		 houseDb.addHouse(house);
    }
}
