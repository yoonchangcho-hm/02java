package study10_ioC_TV3;

public class TVUser {

	public static void main(String[] args) {			
		
		BeanContainer container = new BeanContainer();
		
		TV tv = (TV) container.getBean(args[0]);		
//		tv.powerOn();
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
		
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();

	}
}
