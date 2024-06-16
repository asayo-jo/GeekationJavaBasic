package basicSyntax;

public class IfSwitch {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//1.
		int num = 128;
		
		if (num % 2 == 0) {
			System.out.println("２の倍数です。");
		} else if (num % 3 == 0) {
			System.out.println("３の倍数です。");
		} else {
			System.out.println("どちらでもありません。");
		}
		//2.
		String pref = "兵庫県";
		
		switch (pref) {
		case "北海道" :
			System.out.println("北海道");
			break;
		case "東京都" :
			System.out.println("東京都");
			break;
		case "京都府" :
			System.out.println("京都府");
			break;
		default :
			System.out.println("当てはまりません。");
			break;
		}
	}
	
}