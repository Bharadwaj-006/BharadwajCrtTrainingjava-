package javacrtprograms;
   

class Credit{
	int cardNo=111222;
	int pinNo=111111;
}

class Hacker extends Credit{
	void viewDetils() {
		System.out.println(cardNo);
		System.out.println(pinNo);
	}
	void changeDetails() {
		cardNo=123456;
		pinNo=1111222;
		System.out.println(cardNo);
		System.out.println(pinNo);
	}
}
public class Inheritancee {

	public static void main(String[] args) {
		
		Hacker h=new Hacker();
		h.viewDetils();
		
		System.out.println("-----------------------------");
		h.changeDetails();
		
		
	}

}
