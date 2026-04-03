import java.util.*;

public class vehicleParking {
     
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    // Taking Input From User In Hours. 

        System.out.println("Enter Vehical Parking Time In Hours:");
    int time =  sc.nextInt();
    int totalCharge = 0;

    // Calculating Total Parking Charge Based On Given Time.

    if(time >0 && time<=2){
            totalCharge = 100*2;
    }
    else if(time > 2 && time <=5){
            totalCharge = 100*2 + 50*3;
    }
    else if(time > 5){
            totalCharge = 100*2 + 50*3 + 20*(time-5);
    }
    else{
        System.out.println("Error");
    }
       //     Printing Total Parking Charge.

    System.out.println("Total Parking Charge Is:"+totalCharge);

}
    

}
