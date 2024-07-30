package objectExercise;

	public class Property {
		private String name;
		private String ownerName;
		private String type;
		private int price;
	
		// ゲッターとセッター
		public String getName() {
			return this.name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
	
	    public String getOwnerName() {
	    	return this.ownerName;
		}
	    
		public void setOwnerName(String ownerName) {
			this.ownerName = ownerName;
		}
	
		public String getType() {
			return this.type;
		}
	
		public void setType(String type) {
			this.type = type;
		}
	
		public int getPrice() {
			return this.price;
		}
	
		public void setPrice(int price) {
			this.price = price;
		}
	}