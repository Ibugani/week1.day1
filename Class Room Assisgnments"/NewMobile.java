package week1.day1;

public class NewMobile {
	String Model = "Apple";
	float Weight = 0.25F;
	boolean fullyCharged = true;
	int Cost = 25000;
		
	public void makeCall() {
	
		System.out.println("Make Call");
	}

	public void sendMsg() {
		System.out.println("sendMsg");
	}
	
	public static void main(String[] args) {
NewMobile myMobile = new NewMobile();
myMobile.makeCall();
myMobile.sendMsg();
System.out.println(myMobile.Model);
System.out.println(myMobile.Weight);
System.out.println(myMobile.fullyCharged);
System.out.println(myMobile.Cost);

	}

}

