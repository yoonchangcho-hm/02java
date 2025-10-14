package study10_ioC_TV3;

public class BeanContainer {
	public Object getBean(String id) {
		if(id.equals("lg")) {
			return new LgTV();
		}else if(id.equals("samsung")) {
			return new SamsungTV();
		}
		return null;
	}
}
