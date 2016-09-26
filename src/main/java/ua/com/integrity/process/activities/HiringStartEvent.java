package ua.com.integrity.process.activities;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.com.integrity.model.application.Application;
import ua.com.integrity.model.company.Position;
import ua.com.integrity.service.OrgStructureService;

@Component
public class HiringStartEvent implements ExecutionListener {

	@Autowired
	OrgStructureService orgStructureService;
	
	@Override
	public void notify(DelegateExecution delegateExecution) throws Exception {
		String processInstanceId = delegateExecution.getProcessInstanceId();
		Application application = (Application) delegateExecution.getVariable("application");
		application.setProcessInstanceId(processInstanceId);
		Position position = orgStructureService.getFullPositionById(application.getJob().getPositionId());
		
	}

}
