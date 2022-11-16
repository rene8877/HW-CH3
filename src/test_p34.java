import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class test_p34 {

	public static void main(String[] args)throws IOException {
		System.out.println("請輸入整數");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("您輸入的數字是:"+num);
		

	}

}
