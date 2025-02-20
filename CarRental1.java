import java.util.*;

public class CarRental1
{
	public static void main(String[] args) {
		
		CarRental c1 = new CarRental();
	    
	}
}

class CarRental{
    
    int carId;
    String carType;
    int rent;
    
    Scanner in = new Scanner(System.in);
    
    CarRental(){
        getCar();
    }
    
    void getCar(){
        
        System.out.println("Enter Car Type");
        this.carType = in.nextLine();
        
        System.out.println("Enter Car ID: ");
        this.carId = in.nextInt();
        
        System.out.println();

        this.rent = getRent(this.carType);
        
        showCar();
    }
    
    int getRent(String carType){
        
        if(carType.equals("small")){
            return 1000;
        }
        else if(carType.equals("van")){
            return 800;
        }
        else{
            return 2500;
        }
    }
    
    void showCar(){
        System.out.println("Car ID: "+carId);
        System.out.println("Car type: "+carType);
        System.out.println("Car rent: "+rent);
    }
}

/*
Enter Car Type
lambo
Enter Car ID: 
89

Car ID: 89
Car type: lambo
Car rent: 2500

*/
