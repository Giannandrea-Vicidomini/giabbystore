package JavaBeans;

public class ProductBean {

	public ProductBean() {}
	
	private String title, description, tipology, imgPath;
	private double price;
	private int productCode, availability, shipment;
	
	public int getProductCode() {
		return productCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTipology() {
		return tipology;
	}
	public void setTipology(String tipology) {
		this.tipology = tipology;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailability() {
		return availability;
	}
	public void setAvailability(int availability) {
		this.availability = availability;
	}
	public int getShipment() {
		return shipment;
	}
	public void setShipment(int shipment) {
		this.shipment = shipment;
	}
	
	@Override
	public String toString() {
		return "ProductBean [title=" + title + ", description=" + description + ", tipology=" + tipology + ", imgPath="
				+ imgPath + ", price=" + price + ", productCode=" + productCode + ", availability=" + availability
				+ ", shipment=" + shipment + "]";
	}
	/*ATTENZIONE: IMPOSTARE IL PRODUCT CODE POTREBBE CREARE PROBLEMI SICCOME � PRESENTE L'AUTO_INCREMENT*/
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}
	
}
