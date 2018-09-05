package Entity;

public class Cars {

	private int brandId;
	private String carName;
	
	public Cars(int id, String name, Object brandsByCarId) {
	}

	public void BrandName(int brandId, String carName) {
		this.setBrandId(brandId);
		this.setCarName(carName);
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Object getMembers() {

		return null;
	}

	public Cars getCarById(int id) {

		return null;
	}

	public Cars getCarById1(int id) {
		
		return null;
	}

	public Object getBrands() {
		
		return null;
	}

	public static void createNewCar(String carName2) {

	}


	}


