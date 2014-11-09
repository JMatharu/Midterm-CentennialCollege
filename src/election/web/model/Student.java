package election.web.model;

import election.web.exception.StudentNotRecognizedException;

public class Student {
	String studentId;   
	String password; 
	boolean hasVoted;
	
	public Student(String id, String password ) throws StudentNotRecognizedException {
		setStudentId( id );
		setPassword( password );
		setVoted( false );
	}
	
	public String getStudentId() {
		return studentId;
	}
	private void setStudentId(String id) throws StudentNotRecognizedException {
		if ( id == null || id.isEmpty() ) {
			throw new StudentNotRecognizedException("Attempt to create voter with no student number");
		}
		studentId = id.trim();
	}
	public String getPassword() {
		return password;
	}
	private void setPassword(String password) throws StudentNotRecognizedException {
		if ( password == null || password.isEmpty()) {
			throw new StudentNotRecognizedException("Attempt to create voter with no name");
		}
		this.password = password.trim();
	}

	public boolean isVoted() {
		return hasVoted;
	}

	public void setVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}	

}
