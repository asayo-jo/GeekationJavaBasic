package objectExercise;

	public class Land extends Property {
		private double size;
		
		// ゲッターとセッター
		public double getSize() {
			return this.size;
		}
		
		public void setSize(double size) {
			this.size = size;
		}
		
		public void printDetails() {
			System.out.println("=============================");
			System.out.println("物件名：" + getName());
			System.out.println("物件所有者名：" + getOwnerName());
			System.out.println("物件種別：" + getType());
			System.out.println("物件価格：" + getPrice() + "円");
			System.out.println("広さ：" + getSize() + "㎡");
			System.out.println("=============================");
		}
	}