package ua.com.integrity.model.application;

public class HistoryRecord {
	String executor;
	String comment;
	boolean isApprove;
	
	public HistoryRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HistoryRecord(String executor, String comment, boolean isApprove) {
		super();
		this.executor = executor;
		this.comment = comment;
		this.isApprove = isApprove;
	}

	public String getExecutor() {
		return executor;
	}
	public void setExecutor(String executor) {
		this.executor = executor;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public boolean isApprove() {
		return isApprove;
	}
	public void setApprove(boolean isApprove) {
		this.isApprove = isApprove;
	}
	
	
}
