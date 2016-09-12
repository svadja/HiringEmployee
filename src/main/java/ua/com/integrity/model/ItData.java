package ua.com.integrity.model;

public class ItData {
	private int id;
	private String adLogin;
	private String adPass;
	private String pcComment;
	private boolean isPcPrepared;

	public ItData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItData(int id, String adLogin, String adPass, String pcComment, boolean isPcPrepared) {
		super();
		this.id = id;
		this.adLogin = adLogin;
		this.adPass = adPass;
		this.pcComment = pcComment;
		this.isPcPrepared = isPcPrepared;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdLogin() {
		return adLogin;
	}

	public void setAdLogin(String adLogin) {
		this.adLogin = adLogin;
	}

	public String getAdPass() {
		return adPass;
	}

	public void setAdPass(String adPass) {
		this.adPass = adPass;
	}

	public String getPcComment() {
		return pcComment;
	}

	public void setPcComment(String pcComment) {
		this.pcComment = pcComment;
	}

	public boolean isPcPrepared() {
		return isPcPrepared;
	}

	public void setPcPrepared(boolean isPcPrepared) {
		this.isPcPrepared = isPcPrepared;
	}

}
