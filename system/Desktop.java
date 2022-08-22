package org.system;

public class Desktop extends Computer {

	//Child Class Desktop extends parent class - Computer
	
	public void desktopSize()
	{
		System.out.println("Desktop size is 1920 * 1080");
	}
	
	
	
	public static void main(String[] args) {
		//Single Inheritance
		//Using child class object here we called the parent class method called computerModel.
		Desktop desktop = new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
		

	}

}
