package objectExercise;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// Apartmentのインスタンス
		Apartment apartment = new Apartment();
		apartment.setName("いい感じアパートメント");
		apartment.setOwnerName("山田 マンション太郎");
		apartment.setType("マンション");
		apartment.setPrice(50000000);
		apartment.setLayout("3LDK");
		
		// Landのインスタンス
		Land land = new Land();
		land.setName("いい感じの土地");
		land.setOwnerName("山田 土地太郎");
		land.setType("土地");
		land.setPrice(8000000);
		land.setSize(105.2);
		
		//呼び出し表示
		apartment.printDetails();
		land.printDetails();
	}
	
}
