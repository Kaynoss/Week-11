package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Entity.Brand;
import Entity.Cars;

public class CarDao<MemberDao> {
	
	private Connection connection;
	private MemberDao brandsDao;
	private final String GET_CARS_QUERY = "SELECT * FROM cars";
	private final String GET_CARS_BY_ID_QUERY = "SELECT * FROM cars WHERE id = ?";
	private final String CREATE_NEW_CAR_QUERY = "INSERT INTO cars(name) Values(?)";
	private final String DELETE_CAR_BY_ID_QUERY = "DELETE FROM cars WHERE id = ?";
	private String GET_CAR_BY_ID_QUERY;
	
	public CarDao() {
		connection = DBConnection.getConnection();
		Brand = new MemberDao();
	
	}
	public List<Cars> getCars() throws SQLException {
		ResultSet rs = connection.prepareStatement(GET_CARS_QUERY).executeQuery();		
		List<Cars> cars = new ArrayList<Cars>();
		
		while (rs.next()); {
			cars.add(populateCars(rs.getInt(1), rs.getString(2)));
		}
		
		return cars;
	}
	
	private Cars populateCars(int int1, String string) {
		return null;
	}
	public Cars getCarByID(int id) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(GET_CAR_BY_ID_QUERY);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return populateCar(rs.getInt(1), rs.getString(2)); 
	}

	private Cars populateCar(int int1, String string) {
		
		return null;
	}
	public void createNewCar(String carName) throws SQLException {
		PreparedStatement ps = connection.prepareStatement(CREATE_NEW_CAR_QUERY);
		ps.setString(1, carName);
		ps.executeUpdate();
	}
	
	public void deleteCarById(int id) throws SQLException{
		((Object) brandsDao).deleteBrandById(id); 
		PreparedStatement ps = connection.prepareStatement(DELETE_CAR_BY_ID_QUERY);
		ps.setInt(1,  id);;
		ps.executeUpdate();
		
		}
	
	public Cars getCarById(int id) {
		return null;
	}
	public String getGET_CARS_BY_ID_QUERY() {
		return GET_CARS_BY_ID_QUERY;
	}
	public MemberDao getBrandsDao() {
		return brandsDao;
	}
	public void setBrandsDao(MemberDao brandsDao) {
		this.brandsDao = brandsDao;
	}

	}

		
	
