package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 9123300169266L;
	boolean isPunctured = false;
	String bikeName = "Activa";
	double runningKM = 15645.25;

	public static void main(String[] args) {
		
	TwoWheeler obj = new TwoWheeler();
	int noOfWheels2 = obj.noOfWheels;
short noOfMirrors2 = obj.noOfMirrors;
long chassisNumber2 = obj.chassisNumber;
boolean isPunctured2 = obj.isPunctured;
String bikeName2 = obj.bikeName;
double runningKM2 = obj.runningKM;
System.out.println("No of Wheels: " + noOfWheels2);
//we can also use this way to print the values directly
//System.out.println(obj.noOfWheels);
System.out.println("No of Mirrors: " + noOfMirrors2);
System.out.println("Chassis number is: " + chassisNumber2);
System.out.println("Is Bike Punctured: " + isPunctured2);
System.out.println("Bike Name is: " + bikeName2);
System.out.println("Total running KM: "+ runningKM2);
	}

}
