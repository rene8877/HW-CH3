
public class test_p45 {

	public static void main(String[] args) {
		System.out.println("宣告car1");
		Carpri car1;
		car1 = new Carpri();
		car1.setCar(1234,20.5);
		System.out.println("宣告car2");
		Carpri car2;
		System.out.println("將car1指定給car2");
		car2 = car1;
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
		car2.show();
		System.out.println("改變car1的相關資料");
		car1.setCar(2345,30.5);
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
		car2.show();
	}

}
