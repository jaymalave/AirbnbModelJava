import java.util.Scanner;

public class Driver {
  public static void main(String args[]){
	  Utils utils = new Utils();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Press 1 to register the user, 2 to register house and, 3 for the host");
	  int reg_opt = sc.nextInt();
	  switch(reg_opt) {
	  case 1:
		  utils.registerUser();
		  break;
	  case 2:
		  utils.registerHouse();
		  break;
	  case 3:
		  utils.registerHost();
		  break;
	  default:
		  System.out.println("Enter a valid choice");
		  break;
	  }
  }
}
