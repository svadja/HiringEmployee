package ua.com.integrity.model.application;

import java.util.List;

import ua.com.integrity.model.company.JobDescription;
import ua.com.integrity.model.person.PersonalInformation;

public class Application {

	private int id;
	private String processInstanceId;
	private PersonalInformation person;
	private JobDescription job;
	private ManagerData managerData;
	private ItData itData;
	private boolean isCardRequested;
	private List<HistoryRecord> history;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public PersonalInformation getPerson() {
		return person;
	}

	public void setPerson(PersonalInformation person) {
		this.person = person;
	}

	public JobDescription getJob() {
		return job;
	}

	public void setJob(JobDescription job) {
		this.job = job;
	}

	public ManagerData getManagerData() {
		return managerData;
	}

	public void setManagerData(ManagerData managerData) {
		this.managerData = managerData;
	}

	public ItData getItData() {
		return itData;
	}

	public void setItData(ItData itData) {
		this.itData = itData;
	}

	public boolean isCardRequested() {
		return isCardRequested;
	}

	public void setCardRequested(boolean isCardRequested) {
		this.isCardRequested = isCardRequested;
	}

	public List<HistoryRecord> getHistory() {
		return history;
	}

	public void setHistory(List<HistoryRecord> history) {
		this.history = history;
	}

}
