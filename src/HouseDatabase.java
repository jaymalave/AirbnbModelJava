import java.util.Vector;

public class HouseDatabase {
	Vector<House> houses = new Vector<House>();
  
	 public void addHouse(House house){
		 houses.add(house);
	 }
	 
	 public House getHouse(int index){
		    House house = houses.get(index);
			return house;
	 }
}
