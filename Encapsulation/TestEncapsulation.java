package encapsulaiton;

public class TestEncapsulation {
	public static void main (String[] args) {
		Encapsulation refVar = new Encapsulation();
		refVar.setC(55);
		refVar.setD(89);
		System.out.println(refVar.getC()+refVar.getD());
		
		refVar.setX("java is life");
		System.out.println(refVar.getX());
		
		
	}

}
