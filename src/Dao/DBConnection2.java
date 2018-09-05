package Dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Brand;

public class DBConnection2 {

	private static final String GET_BRANDS_BY_CARS_ID_QUERY = null;
	private Connection connection;
	private final String GET_BRANDS_BY_CAR_ID_QUERY = "SELECT * FROM brands WHERE car_id = ?";
	private final String DELETE_BRANDS_BY_CAR_ID_QUERY = "DELETE FROM brands WHERE car_id = ?";
	private final String CREATE_NEW_BRAND_QUERY = "INSERT INTO brands (car_name, car_id) VALUES(?,?,?)";
	private final String DELETE_BRAND_BY_ID_QUERY = "DELETE FROM brands WHERE id = ?";
	
	public void BrandDao() {
		connection = DBConnection.getConnection();
	}
	public List<Brand> getBrandByTeamId(int carId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_BRANDS_BY_CARS_ID_QUERY);
		ps.setInt(1, carId);
		ResultSet rs = ps.executeQuery();
		List<Brand> brands = new ArrayList<Brand>();
		
		while (rs.next()) {
			brands.add(new Brand(rs.getInt(1), rs.getString(2)));
		}
		
		return brands;
	}

	public void createNewbrand(String carName, int carId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_BRAND_QUERY);
		ps.setString(1, carName);
		ps.setInt(3, carId);
		ps.executeUpdate();
	}
	
	public void deleteBrandsByCarsId(int carId) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_BRANDS_BY_CAR_ID_QUERY);
		ps.setInt(1, carId);
		ps.executeUpdate();
		
	}
	public void deleteBrandById(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(DELETE_BRAND_BY_ID_QUERY);
		ps.setInt(1, id);
		ps.executeUpdate();
	}
	public String getGET_BRANDS_BY_CAR_ID_QUERY() {
		return GET_BRANDS_BY_CAR_ID_QUERY;
	}
	public Object getBrandsByCarId(int id) {
		return null;
	}

}