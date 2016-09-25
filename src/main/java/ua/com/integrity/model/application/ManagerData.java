package ua.com.integrity.model.application;

public class ManagerData {
	private int id;
	private String workspace;
	private String pc;

	public ManagerData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ManagerData(int id, String workspace, String pc) {
		super();
		this.id = id;
		this.workspace = workspace;
		this.pc = pc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkspace() {
		return workspace;
	}

	public void setWorkspace(String workspace) {
		this.workspace = workspace;
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

}
