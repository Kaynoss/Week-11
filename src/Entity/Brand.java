package Entity;

import java.util.List;

public class Brand {

	private int brandId;
	private String carName;
	
	public Brand(int brandId, String carName) {
		this.setBrandId(brandId);
		this.setCarName(carName);
	}

	public void Car(int id, String name, List<Brand> brandsBybrandId) {
		
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	
	}

	public String getCarId() {
		
		return null;
	}

	public String getCars() {
		
		return null;
	}

	public Object getBrands() {
		
		return null;
	}

	public String getCarName() {
		return carName;
	}

	public void deleteMemberById(int id) {
		
	}

	public void createNewBrand(String carName2, int carId) {
		
	}
}



