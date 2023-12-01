package org.javaro.lecture;

public class GPSNavigation {
	  private String navigationID;
	    private String productName;
	    private String manufacturer; // 제조사
	    private Person person;

	    public GPSNavigation() {}

	    public GPSNavigation(String navigationID, String productName) {
	        this.navigationID = navigationID;
	        this.productName = productName;
	        this.manufacturer = "unknown manufacturer";
	    }

	    public void setNavigationID(String navigationID) {
	        this.navigationID = navigationID;
	    }

	    public String getNavigationID() {
	        return this.navigationID;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    public String getManufacturer() {
	        return manufacturer;
	    }

	    public void setPerson(Person person) {
	        this.person = person;
	    }

	    public Person getPerson() {
	        return this.person;
	    }

	    public String toString() {
	        String available;
	        if (this.getPerson() == null) {
	            available = "대여 가능";
	        } else {
	            available = "대여자=" + this.getPerson().getName();
	        }
	        return "ID=" + this.getNavigationID() + ", 제품명=" + this.getProductName() + ", 제조사=" + this.getManufacturer() + ", " + available;
	    }
}
