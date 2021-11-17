
public class House {
    int house_id;
    int owner_id;
    int customer_id;
    String address;
    boolean occupied;
    int occup_count;
    String city;
    House(int house_id, int owner_id, int customer_id, String address, boolean occupied, int occup_count, String city){
       this.house_id = house_id;
       this.owner_id = owner_id;
       this.customer_id = customer_id;
       this.address = address;
       this.occupied = occupied;
       this.occup_count = occup_count;
       this.city = city;  
	}
}
