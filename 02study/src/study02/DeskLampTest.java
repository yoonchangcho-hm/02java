package study02;

public class DeskLampTest {

	public static void main(String[] args) {
		DeskLamp myLamp = new DeskLamp();
//		myLamp.isOn = true;
		
		
		myLamp.turnOn();
		System.out.println(myLamp);
		
		myLamp.turnOff();
		System.out.println(myLamp);
		
	}

}
