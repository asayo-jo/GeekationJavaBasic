package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1.
		int a = 20;
		int b = 10;
		boolean resultA = (a > b);

		System.out.println(resultA);

		//2.
		boolean isSunny = true;
		boolean isWarm = true;
		boolean resultB = (isSunny && isWarm);
		
		System.out.println(resultB);

		//3.
		int x = 10;
		int y = 2;
		boolean resultC = (x >= 0 && y % 2 == 0 );

		System.out.println(resultC);

		//4.
		boolean hasPermission = false;
		boolean resultD = !hasPermission;

		System.out.println(resultD);
	}
}
