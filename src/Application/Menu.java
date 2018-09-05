package Application;


import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import Entity.Brand;
import Entity.Cars;

public class Menu {
	
	private Brand brand = new Brand(0, null);
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display Cars",	
			"Delete a Car",
			"Create a Car",
			"Update a Brand");		
	
	public void start() {
		String selection = "";
		
		do {
			printMenu();
			selection = scanner.nextLine();
			
			try { 	
				if (selection.equals("1")) {
					displayCars();
				} else if (selection.equals("2")) {
				
				} else if (selection.equals("3")) {
					createCar();
				} else if (selection.equals("4")) {
					updateBrand();
				}	
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
			System.out.println("Press enter to continue....");
			scanner.nextLine();
		} while (!selection.equals("-1"));
	}
	private void displayCars() {		
	}
	private void createCar() {		
	}
	private void printMenu() {
		System.out.println("Select an Option:\n-------------------");
		for (int i = 0; i < options.size(); i++) {
			System.out.println(i +1 + ") " + options.get(i));
		}
	}
	

	private void displayCars1() throws SQLException  {
		System.out.println("Enter car id: ");
		int id = Integer.parseInt(scanner.nextLine());
		Cars car = car.getCarById(id);
		System.out.println(car.getCarName() + ": " + car.getCarName());
		Brand cars;
		for (Brand brand : brand.getBrands()) {
			System.out.println("\tBrandId: " + brand.getBrandId() + " - Name: " + brand.getCarName());
			
			
			
			
	private void deleteCar() throws SQLException{
		System.out.println("Enter team id to delete");
		int id = Integer.parseInt(scanner.nextLine());
		Object car;
		((Object) car).deleteCarById(id);
	}	

	
	@SuppressWarnings("unused")
	private void createBrand() throws SQLException {
		System.out.println("Enter first name of new brand:");
		String carName = scanner.nextLine();
		System.out.println("Enter team id of new brand:");
		int carId = Integer.parseInt(scanner.nextLine());
		brand.createNewBrand(carName, carId);
	}

	private void updateBrand() throws SQLException {
		System.out.println("Enter brand id to delete:");
		int id = Integer.parseInt(scanner.nextLine());
		brand.deleteMemberById(id);
	}	
}
