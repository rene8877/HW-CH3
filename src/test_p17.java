
public class test_p17 {

	public static void main(String[] args) {
		Car car1;
		car1=new Car();
		car1.setNumGas(1234, 20.5);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是"+number+"，汽油量是"+gasoline);
		

	}

}
