package entity;

public class JobClass {
	
	private int id;
	private String job;
	private String difficulty;
	
	public JobClass(int id, String job, String difficulty) {
		this.id = id;
		this.job = job;
		this.difficulty = difficulty;
		
	}

	public int getId() {
		return id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {		
		this.job = job;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
	
	@Override
	public String toString () {
		return id + " " + "job: " + job + " difficulty: " + difficulty;
		
	}
	
}
