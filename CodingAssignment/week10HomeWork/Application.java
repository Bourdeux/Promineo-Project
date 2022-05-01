package application;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

import dao.DBConnection;
import dao.JobClassDao;
import entity.JobClass;

public class Application {

	public static void main (String[] args) throws Throwable {
		
	DBConnection dbConnection = new DBConnection(); //new object to log into DB
	Scanner scanner = new Scanner(System.in);
	 
	
	try {
		Connection connection = dbConnection.connect(); //.connect connects to DB, then pass into JobClassDao which needs a connection
		JobClassDao jobClassDao = new JobClassDao(connection); //new object for JobClassDao
	

		while(true) { 
			
			menu();
			int selection = scanner.nextInt();
			
			switch(selection) {
			
			case 1:
				System.out.println("Please enter job: ");
				String jobInput = scanner.next();
				System.out.println("Please enter difficulty (Beginner, Intermediate, Expert): ");
				String difficultyInput = scanner.next();
				jobClassDao.createJobClass(jobInput, difficultyInput);
				break;
				
			case 2:
				System.out.println("Please enter job ID: ");
				int idInput = scanner.nextInt();
				JobClass print = jobClassDao.readJobClass(idInput);
				System.out.println(print);
				break;
			
			case 3:
				System.out.println("Please enter job id: ");
				int idUdateInput = scanner.nextInt();
				System.out.println("Enter new job: ");
				String jobUpdateInput= scanner.next();
				System.out.println("Enter new difficulty (Beginner, Intermediate, Expert): ");
				String difficultyUpdateInput = scanner.next();
				jobClassDao.updateJobClass(idUdateInput, jobUpdateInput, difficultyUpdateInput);			
				break;
			
			case 4:
				System.out.println("Please enter job id: ");
				int deleteUpdateInput = scanner.nextInt();
				jobClassDao.deleteJobClass(deleteUpdateInput);
				System.out.println("Job deleted.");
				break;
			
			case 5:
				List<JobClass> jobClasses = jobClassDao.listJobClass();
				if (jobClasses.isEmpty()) {
					System.out.println("No Data.");
				} else {
					for (JobClass jobClass : jobClasses) {
						System.out.println(jobClass);
					}
				}
				System.out.println();
				break;
				
			default:
				System.out.println("Please enter a valid selection!!!");
				break;
			
			case -1:
				System.out.println("Goodbye.");
				return;
			} 
		}		
		
	} catch (Exception e) {
		System.out.println(e);
	} finally {
		dbConnection.disconnect();
	}
	
  }

	private static void menu() {
		System.out.println(
				"1) Create Job\n" +
				"2) Display Job\n" +
				"3) Update Job\n" +
				"4) Delete Job\n" +
				"5) List Jobs\n" +
				"-1) Exit"
				);
	}
	
}
