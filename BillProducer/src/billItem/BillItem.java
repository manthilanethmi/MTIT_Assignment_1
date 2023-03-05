package billItem;

public class BillItem {
		private String foodItem;
		private String foodName;
		private String  quantity;

		public BillItem(){}


		public BillItem(String foodItem, String foodName, String quantity) {
			super();
			this.foodItem = foodItem;
			this.foodName = foodName;
			this.quantity = quantity;
		}
		public String getFoodItem() {
			return foodItem;
		}
		public void setFoodItem(String foodItem) {
			this.foodItem = foodItem;
		}
		public String getFoodName() {
			return foodName;
		}
		public void setFoodName(String foodName) {
			this.foodName = foodName;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}

}
