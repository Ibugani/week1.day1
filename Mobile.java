package week1.day1;

public class Mobile {
	public void makecall() {
		System.out.println("makecall");
	}

	public void sendMsg() {
		System.out.println("sendMsg");
	}
	public static void main(String[] args) {
		
System.out.println("Mobile");
Mobile myMobile = new Mobile();
myMobile.makecall();
myMobile.sendMsg();

	}

}
