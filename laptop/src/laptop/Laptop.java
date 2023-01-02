package laptop;

public class Laptop {
	private String brandName;
	private String modelName;
	private Integer sellingPrice;
	private Float screenScize;
	private Integer storageCapacity;
	private Boolean isSSD;
	private String os;
	
	public Laptop(String brandName,String modelName,Integer sellingPrice, Float screenSize,Integer storageCapacity,Boolean isSSD,String os) {
		 this.brandName=brandName;
		 this.modelName=modelName;
		 this.sellingPrice=sellingPrice;
		 this.screenScize=screenSize;
		 this.storageCapacity=storageCapacity;
		 this.isSSD=isSSD;
		 this.os=os;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public Integer getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(Integer sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Float getScreenScize() {
		return screenScize;
	}

	public void setScreenScize(Float screenScize) {
		this.screenScize = screenScize;
	}

	public Integer getStorageCapacity() {
		return storageCapacity;
	}

	public void setStorageCapacity(Integer storageCapacity) {
		this.storageCapacity = storageCapacity;
	}

	public Boolean getIsSSD() {
		return isSSD;
	}

	public void setIsSSD(Boolean isSSD) {
		this.isSSD = isSSD;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	
	
	
}
