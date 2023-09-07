package hospital;

public class MainHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Incurance incurance = new Incurance(1,"erdem","mersin","ahmet",'b',1000);
		incurance.setLawyer("þeker");
		incurance.toStr();
		System.out.println(incurance.bill());
		
		
	}

}
