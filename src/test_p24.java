
public class test_p24 {

	public static void main(String[] args) {
		Carpri car1;
		car1=new Carpri();
		car1.setCar(1234,20.5);
		car1.show();
		System.out.println("只變更車號");
		car1.setCar(2345);
		car1.show();
		System.out.println("只變更汽油量");
		car1.setCar(30.5);
		car1.show();

	}

}
