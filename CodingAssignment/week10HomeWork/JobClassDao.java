package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.JobClass;

public class JobClassDao {
	
	private Connection connection;
	
	
	public JobClassDao(Connection connection) {
		this.connection = connection;
	}
	
	public boolean createJobClass(String job, String difficulty) throws SQLException {
		String query =  "INSERT INTO job_class (name, difficulty) VALUES (? , ?)";
		PreparedStatement insertStatement;
		insertStatement = connection.prepareStatement(query);
		insertStatement.setString(1, job);
		insertStatement.setString(2, difficulty);
		int rowsCreate = insertStatement.executeUpdate();
				
		return rowsCreate > 0;
			
	}
	
	public JobClass readJobClass(int id) throws Throwable {
		String query = "SELECT * FROM job_class where id = ?";
		PreparedStatement readStatement;
		readStatement = connection.prepareStatement(query);
		readStatement.setInt(1,id);
		ResultSet queryResult = readStatement.executeQuery();
		
		if(queryResult.next() == false) {
			throw new Exception("Job class not found");
		}
		
		return new JobClass(id, 
				queryResult.getString(2), 
				queryResult.getString(3));
		
	}
	
	public boolean updateJobClass(int id, String job, String difficulty) throws SQLException {
		String query = "UPDATE job_class SET name = ?, difficulty = ? where id = ?";
		PreparedStatement updateStatement;
		updateStatement = connection.prepareStatement(query);
		updateStatement.setString(1, job);
		updateStatement.setString(2, difficulty);
		updateStatement.setInt(3, id);
		int rowsUpdate = updateStatement.executeUpdate();
				
		return rowsUpdate > 0;
	}
	
	public boolean deleteJobClass(int id) throws SQLException {
		String query = "DELETE FROM job_class WHERE id = ?";
		PreparedStatement deleteStatement;
		deleteStatement = connection.prepareStatement(query);
		deleteStatement.setInt(1, id);		
		int rowsDelete = deleteStatement.executeUpdate();
				
		return rowsDelete > 0;	
		
	}
	
	public List<JobClass> listJobClass() throws SQLException{ 
	String query = "SELECT * FROM job_class";
	PreparedStatement showAll;
	showAll = connection.prepareStatement(query);
	ResultSet queryResult = showAll.executeQuery();
	
	List<JobClass> jobList = new ArrayList<JobClass>();	
	
	while (queryResult.next()) {
		jobList.add(new JobClass(queryResult.getInt(1), 
				queryResult.getString(2), 
				queryResult.getString(3)));		
	}
	
	return jobList;
	}
}
