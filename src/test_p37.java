import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class test_p37 {

	public static void main(String[] args)throws IOException {
		System.out.println("請輸入英文字母");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strl = str.toLowerCase();
		String stru = str.toUpperCase();
		System.out.println("轉換成大寫時為"+stru);
		System.out.println("轉換成小寫時為"+strl);

	}

}
