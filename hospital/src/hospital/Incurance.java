package hospital;

public class Incurance extends Patient{

char incurance;
String treatment;
int payment;
int id;
String name;
String state;
String lawyer;


public Incurance(int id, String name, String state, String lawyer,char incurance, int payment) {
	
	super(id,name,state,lawyer);
	this.incurance = incurance;
	this.payment = payment;
	
}
public int bill() {
	int pay = 0;
	switch (incurance) {
	case 'a': {
		String treatment = "You can use dental treatments, ortopedics and get %50 off other treatments";
		System.out.println(treatment);
		pay = this.payment / 2 ;
	
		break;
	}
	case 'b': {
		String treatment = "You can use dental treatments, ortopedics and get %70 off other treatments";
		System.out.println(treatment);
		pay = (this.payment * 3)/10 ;
		break;
	}
	case 'c': {
		String treatment = "Since you dont have an incurance you have pay the exact amount on your bill.";
		System.out.println(treatment);
		pay = this.payment;
		
		break;
	}
	default:
		pay = 0;
		throw new IllegalArgumentException("Unexpected value: " + incurance);
		
	}
	return pay;
}

}
