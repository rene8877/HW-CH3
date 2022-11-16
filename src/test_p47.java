
public class test_p47 {

	public static void main(String[] args) {
		Carpri car1;
		car1=new Carpri();
		car1.show();
		int number =1234;
		double gasoline = 20.5;
		String str = "1號車";
		car1.setCar(number,gasoline);
		car1.setName(str);
		car1.show();
		
	}
}
