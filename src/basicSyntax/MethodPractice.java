package basicSyntax;

public class MethodPractice {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 10;
		int b = 5;
		int result1 = add(a, b);
		int result2 = sub(a, b);
		int result3 = mul(a, b);
		int result4 = div(a, b);
        
		printResult(result1);
		printResult(result2);
		printResult(result3);
		printResult(result4);
		}
	
	// メソッド1: 二つの値を足し算するメソッド
	public static int add(int x, int y) {
		int add = x + y;
		return add;
		}
	
	// メソッド2: 二つの値を引き算するメソッド
	public static int sub(int x, int y) {
		int sub = x - y;
		return sub;
		}
	
	// メソッド3: 二つの値を掛け算するメソッド
	public static int mul(int x, int y) {
		int mul = x * y;
		return mul;
		}
	
	// メソッド4: 二つの値を割り算するメソッド
	public static int div(int x, int y) {
		int div = x / y;
		return div;
		}
	
	// メソッド5: 結果をコンソールに出力するメソッド
	public static void printResult(int result) {
		System.out.println("計算結果は" + result + "です。");
		}
	
}
