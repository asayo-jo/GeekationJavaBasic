package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1.
		int a = 20;
		int b = 10;
		boolean result = (a > b);
		
		System.out.println(result);
		
		//2.
		boolean isSunny = true;
		boolean isWarm = true;
		boolean resultA = (isSunny && isWarm);
		
		System.out.println(resultA);
		
		//3.
		int x = 10;
		int y = 2;
		boolean resultB = (x >= 0 && y % 2 == 0 );
		
		System.out.println(resultB);
		
		//4.
		boolean hasPermission = false;
		boolean resultC = !hasPermission;
		
		System.out.println(resultC);
	}
}
