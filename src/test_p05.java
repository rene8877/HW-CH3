
public class test_p05 {

	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
	}

}
class Car{
	int num;
	double gas;
	
	int getNum() {
		System.out.println("調查車號");
		return num;
	}
	double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}	
	
	void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
	void showCar() {
		System.out.println("開始顯示車子資料");
		this.show();
	}
	void setNum(int n) {
		num =n;
		System.out.println("將車號設為"+num);
	}
	void setGas(double g) {
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	
	void setNumGas(int n,double g) {
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
}
class Carpri{
	public static int sum=0;
	private int num;
	private double gas;
	private String name;
	public Carpri() {
		num=0;
		gas=0.0;
		name = "沒有名稱";
		sum++;
		
		System.out.println("生產了車子");
	}
	public Carpri(int n,double g) {
		this();
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	public void setName(String nm) {
		name=nm;
		System.out.println("將車名設為"+name);
	}
	int getNum() {
		System.out.println("調查車號");
		return num;
	}
	double getGas() {
		System.out.println("調查汽油量");
		return gas;
	}	
	void show() {
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
		System.out.println("車名是"+name);
	}
	void showCar() {
		System.out.println("開始顯示車子資料");
		this.show();
	}
	void setNum(int n) {
		num =n;
		System.out.println("將車號設為"+num);
	}
	void setGas(double g) {
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	public void setCar(int n) {
		num = n;
		System.out.println("將車號設為"+num);
	}
	public void setCar(double g) {
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	public void setCar(int n,double g) {
		gas = g;
		num = n;
		System.out.println("將車號設為"+num+"將汽油量設為"+gas);
	}
	public static void showSum() {
		System.out.println("車子總共有"+sum+"台");
	}
	void setNumGas(int n,double g) {
		if(g>0&&g<100) {
			num = n;
			gas = g;
			System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
		}
		else {
			System.out.println(g+"不是正確的汽油量");
			System.out.println("無法變更汽油量");
		}
	}
}