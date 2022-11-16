
public class test_p22 {

	public static void main(String[] args) {
		Carpri car1;
		car1=new Carpri();
		car1.setNumGas(1234, 20.5);
		car1.show();
		System.out.println("指定不正確的汽油量{-10.0}看看");
		car1.setNumGas(1234, -10.0);
		car1.show();

	}

}
